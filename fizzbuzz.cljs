
;; Requirements
;; Return “fizz”, “buzz” or “fizzbuzz”.
;; For a given natural number greater than zero return:

;; “fizz” if the number is dividable by 3
;; “buzz” if the number is dividable by 5
;; “fizzbuzz” if the number is dividable by 15
;; the same number(in String form) if no other requirement is fulfilled


(ns fizzbuzz-kata)


(defn fizzbuzz
  [n]
  (if (= (mod n 15) 0) "fizzbuzz"
    (if (= (mod n 5) 0) "buzz"
      (if (= (mod n 3) 0) "fizz" (str n)))))
