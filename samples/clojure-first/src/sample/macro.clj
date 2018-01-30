(ns sample.macro)

(println (macroexpand-1 '(when true (println "hello"))))


;Treading macro
(println
  (macroexpand-1
    '(-> (a 1)
         (b 2)
         (c 3)
         (d 4))
    ))