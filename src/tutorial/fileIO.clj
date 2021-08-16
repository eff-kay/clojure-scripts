(ns tutorial.core
    (:require [clojure.string :as str])
    (:require [clojure.java.io :as io])
    (:gen-class))

(defn write-to-file
    [file text]
    (with-open [wrtr (io/writer file)]
        (.write wrtr text)))
    
(defn read-from-file
    [file]
    (try
        (println (slurp file))
    (catch Exception e (println "Error: " (.getMessage e)))))

(defn append-to-file
    [file text]
    (with-open [wrtr (writer file :append true)]
        (.write wrtr text)))

(defn read-line-from-file
    [file]
    (with-open [rdr (io/reader file)]
        (doseq [line (line-seq rdr)]
            (println line))))
    
(defn print-list
    [& nums]
    (doseq [x nums]
        (println x)))

(defn -main
    "I don't do a whole lot ... yet."
    [& args]
    (print-list 7 8 9)
    (write-to-file "test2.txt" "this is my text\n")
    (read-from-file "test2.txt")
    (append-to-file "test2.txt" "extr stuff")
    (read-from-file "test2.txt")
    (read-line-from-file "test2.txt")
)
