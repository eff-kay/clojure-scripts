(ns tutorial.core
    (:require [clojure.string :as str])
    (:gen-class))
 
    
  (defn say-hello
    "Receives a name with 1 paramters and responds"
    [name]
    (println "Hello again" name)
    )

  (defn get-sum
    [x y]
    (println (+ x y))
    )

  (defn get-sum-more
    ([x y z]
        (println (+ x y z)))
    ([x y]
        (println (+ x y)))
    )

  (defn hello-you
    [name]
    (str "Hello " name))

  (defn hello-all
    [& names]
    (map hello-you names))

  (defn -main
    "I don't do a whole lot ... yet."
    [& args]
    (say-hello "derek")
    (get-sum 4 5)
    (get-sum-more 4 5 6)
    (get-sum-more 4 5)
    (hello-all "Doug" "Mary" "Paul")
    )
  