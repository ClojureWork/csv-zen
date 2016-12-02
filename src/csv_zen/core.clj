(ns csv-zen.core
  (:require [ring.adapter.jetty :as jetty]))

(defn -main []
  (jetty/run-jetty (fn [req] {:headers {}
                              :status 200
                              :body "Hello, World"})
                   {:port 8080}))