(ns sample.canditionals)

(defn check [t]
  (if t
    (println "True")
    (println "False"))
  )

(check true)

;Burada conditionun yerine value qoymusham, o da falsedir. ona gore else hali olur.
;Bu halda da value olmadiqindan nil cixir
(println (if false "True"))
