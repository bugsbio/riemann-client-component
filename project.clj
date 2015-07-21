(defproject riemann-client-component "0.1.0-SNAPSHOT"
  :description "Component wrapping up a riemann-client's lifecycle."
  :url "http://github.com/bugsbio/riemann-client-component"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "CF73E6ED"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [riemann-clojure-client "0.4.1"]]
  :plugins [[lein-ancient "0.5.5"]])
