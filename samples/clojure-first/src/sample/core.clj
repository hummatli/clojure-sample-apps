(ns sample.core)

(println "Hello World1")

(println (+ 2 1))
(println (/ 2 3))
(println (double ( / 2 3)))                                           ;Comment
(println (quot 3 2))
(println (rem 3 2))


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


;Demonstrating metadata, elave meta datani deyishenden evvel qoyduq
(def ^{:true? true} real-identity {:name "Sattar"})

(println (meta #'real-identity))






