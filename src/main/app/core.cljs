(ns app.core
  (:require ["google-home-notifier" :as googlehome]
            ["readline" :as readline]))

;; (defonce device-name "ghome")
(defonce device-ip "192.168.3.11") ; TODO: change your Google Home's ip address
(defonce language "ja")

(defn say [text]
  ;; (.device googlehome device-name "ja")
  (.ip googlehome device-ip language)
  (.notify googlehome text (clj->js (fn [res] (prn res)))))

(defn watch-input []
  (let [reader (.createInterface readline #js {:input js/process.stdin :output js/process.stdout})]
    (.on reader "line" (fn [line] (say line)))
    (.on reader "close" (fn [] nil))))

(defn reload! []
  (println "Code updated."))

(defn dev-main []
  (println "App loaded!"))

(defn main! [& args]
  (if (empty? args)
    (watch-input)
    (say (first args))))
