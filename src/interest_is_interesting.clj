(ns interest-is-interesting)

(defn interest-rate
  "TODO: add docstring"
  [balance]
  (condp = true
    (< balance 0) -3.213
    (< balance 1000) 0.5
    (< balance 5000) 1.621
    (>= balance 5000) 2.475))

(defn abs [n] (max n (- n)))

(defn get-interest-rate-percentage-by-balance
  "Return the balance interest rate in percentage"
  [balance]
  (bigdec (/ (interest-rate balance) 100)))

(defn get-new-balance-value-by-rate-percentage
  [balance percentage]
  bigdec (* (abs balance) percentage))

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
  (let [interest-percentage (get-interest-rate-percentage-by-balance balance)
        new-balance-sum (get-new-balance-value-by-rate-percentage balance interest-percentage)
        new-balance (bigdec (+ balance new-balance-sum))]
    new-balance))

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage])
