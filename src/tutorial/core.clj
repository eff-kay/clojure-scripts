(ns tutorial.core
  (:require [clojure.string :as str])
  (:gen-class))

(def ranVar 10)
(def adouble 1.23)

(double? adouble)

(type false)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def str1 "This is me 2nd string")
  (str/blank? str1)
  (str/includes? str1 "my")
  (str/index-of str1 "my")
  (str/split str1 #" ")
  (str/split str1 #"\d")
  (str/join " " ["The", "Big", "Cheese"])
  (str/replace "I am 42" #"\d\d" "43")
  (str/upper-case str1)
  (str/lower-case str1)
  ;; list
  (println (list "Dogs" 1 3.4 true))
  (println (first (list 1 2 3)))
  (println (rest (list 1 2 3)))
  (println (nth (list 4 7 3) 1))
  (println (list* 1 2 [3 4 7])) 
  (println (cons 3 (list 1 2))) 
  ;; set
  (println (get (set '(3 2)) 2))
  (println (conj (set '(3 2)) 1))
  (println (contains? (set '(3 2)) 2))
  (println (disj (set '(3 2)) 2))
  ;; vector
  (println (get (vector 2 3) 0))
  (println (conj (vector 2 3) 5))
  (println (pop (vector 2 3)))
  (println (subvec (vector 2 3 4 7) 1 3))
  ;; map
  (println (hash-map "Name" "Derek" "Age" 43))
  (println (sorted-map 3 42 2 "Banas" 1 "Derek"))
  (println (get (hash-map "Name" "Derek" "Age" 43) "Age")
  (println (find (hash-map "Name" "Derek" "Age" 43) "Age")
  (println (contains? (hash-map "Name" "Derek" "Age" 43) "Age")
  (println (contains? (hash-map "Name" "Derek" "Age" 43) "test")
  (println (keys (hash-map "Name" "Derek" "Age" 43))
  (println (vals (hash-map "Name" "Derek" "Age" 43))
  (println (merge-with + (hash-map "Name" "Derek") (hash-map "Age" 43))
  )