(ns sample.macro)

(println (macroexpand-1 '(when true (println "hello"))))
