(ns sample.functions)


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


;Declare function name before using it, body after using it

(declare get-y)
(defn get-x []
  (+ (get-y) 4))
(defn get-y []
  38)

(println (get-y))
(println (get-x))

;Function with return
(defn return_func []
  "This is return value")
(println (return_func))


;Function returning function
(defn make-a-fn-that-knows-the-secret [password]
  (let [the-secret password]
    (fn [password]
      (if (= password the-secret)
        :ok
        :fail!))))

;Set returning function and call it after
(def check-password (make-a-fn-that-knows-the-secret "cats"))
(println (check-password "cats"))
(println (check-password "dogs"))

;Function direct call
(println ((make-a-fn-that-knows-the-secret "cats") "dogs"))
(println ((make-a-fn-that-knows-the-secret "dogs") "dogs"))

;Show returning function metadata
(println (meta #'check-password))
