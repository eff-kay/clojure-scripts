(ns tutorial.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn math-stuff
  []
  (println (+ 1 2))
  (println (- 1 2 3))
  (println (* 2 5))
  (println (/ 10 5))
  (println (mod 12 5))
  (println (inc 5))
  (println (dec 5))
  (println (Math/abs -5))
  (println (Math/cbrt 8))
  (println (Math/sqrt 4))
  (println (Math/ceil 4.5))
  (println (Math/floor 4.5))
  (println (Math/exp 1))
  (println (Math/hypot 2 2))
  (println (Math/log 2.7123))
  (println (Math/log10 100))
  (println (Math/max 1 5))
  (println (Math/min 1 5))
  (println (Math/pow 2 3))
  (println (rand-int 20))
  (reduce + [1 2 3])
  (println (Math/PI))
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (math-stuff)
  )
