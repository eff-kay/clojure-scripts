(ns tutorial.core
    (:require [clojure.string :as str])
    (:require [clojure.java.io :as io])
    (:gen-class))

(defn destruct
    []
    (def vectVals [1 2 3 4])
    (let [[one two & the-rest] vectVals]
        (println one two the-rest))
)

(defn struct-map-ex
    []
    (defstruct Customer :Name :Phone)
    (def cust1 (struct Customer "Doug" 412))
    (def cust2 (struct-map Customer :Name "Sally" :Phone 312))
    (println cust1)
    (println (:Name cust2)))

(defn -main
    "I don't do a whole lot ... yet."
    [& args]
    (print-list 7 8 9)
    ;; (destruct)
    (struct-map-ex)
)
