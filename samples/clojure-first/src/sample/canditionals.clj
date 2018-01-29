(ns sample.canditionals)

(defn check [t]
  (if t
    (println "True")
    (println "False"))
  )

(check true)
