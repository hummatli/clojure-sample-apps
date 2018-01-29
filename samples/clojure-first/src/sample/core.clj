(ns sample.core)

(println "Hello World1")

(println (+ 2 1))
(println (/ 2 3))
(println (double ( / 2 3)))                                           ;Comment
(println (quot 3 2))
(println (rem 3 2))

;First function
(defn first-function [str1]
  (println str1))

;Caling function
(first-function "Hello")

;define function using let expression
(defn func-with-binding [x]
  (let [x2 (* 2 x)
        x2+1 (+ x2 1)
        x2+1over2 (/ x2+1 2)]
    (println x2)
    (println x2+1)
    (println x2+1over2)))

;Calling functuin
(func-with-binding 4)


;Use regular expression
(println (re-find #"ca+t" "a caaaaat and dog"))

;Symbols
(def a 42)
(println a)

(println ('a {'a 32, 'b 22}))

;Keywords
(println (:c {:c 32, :d 22}))

;Functions for read and evaluate (repl)
(println (eval (read-string "(+ 1 2 3)")))


