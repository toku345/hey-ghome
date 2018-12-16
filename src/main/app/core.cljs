(ns app.core
  (:require ["google-home-notifier" :as googlehome]))

;; (defonce device-name "ghome")
(defonce device-ip "192.168.3.11")
(defonce language "ja")

(defn say [text]
  ;; (.device googlehome device-name "ja")
  (.ip googlehome device-ip language)
  (.notify googlehome text (clj->js (fn [res] (prn res)))))


(defn reload! []
  (println "Code updated."))

(defn main! []
  (println "App loaded!"))
