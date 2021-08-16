(ns tutorial.core
    (:require [clojure.string :as str])
    (:gen-class))

(defn can-vote
    [age]
    (if (>= age 18)
        (println "you can vote")
        (println "you can't vote")))

(defn can-do-more
    [age]
    (if (>= age 18)
        (do (println "you can drive")
            (println "you can vote"))
        (println "you can't vote")))

(defn when-ex1
    [tof]
    (when true
        (println "first thing") (println "second thing")))

(defn what-grade
    [n]
    (cond 
        (< n 5) (println "Preschool")
        (= n 5) (println "kindergarten")
        (and (> n 5) (<= n 18)) (format "Go to grade %d" (- n 5))
        :else "Go to college"))

  (defn -main
    "I don't do a whole lot ... yet."
    [& args]
    (can-vote 19)
    (can-do-more 24)
    (when-ex1 true)
    (what-grade 19)
    )
  