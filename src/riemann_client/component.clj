(ns riemann-client.component
  (:require
    [riemann.client             :as riemann]
    [com.stuartsierra.component :as component]))

(defrecord RiemannClient []
  component/Lifecycle
  (start [this]
    (if (:client this)
      this
      (->> (riemann/tcp-client)
           (assoc this :client))))
  (stop [this]
    (when-let [client (:client this)] (.close client))
    (dissoc this :client)))

(defn new-riemann-client
  [& {:as opts}]
  (map->RiemannClient opts))
