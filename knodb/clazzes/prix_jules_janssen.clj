(ns clazzes.prix_jules_janssen
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Term "Prix Jules Janssen")

(name-as-in "Prix Jules Janssen" "Jules-Janssen-Preis" "de")
(name-as-in "Prix Jules Janssen" "" "zh-hk")
(name-as-in "Prix Jules Janssen" "" "zh-tw")
(name-as-in "Prix Jules Janssen" "" "ru")
(name-as-in "Prix Jules Janssen" "Prémio Jules Janssen" "pt")
(name-as-in "Prix Jules Janssen" "Prix Jules Janssen" "en")
(name-as-in "Prix Jules Janssen" "" "zh-cn")
(name-as-in "Prix Jules Janssen" "Prix Jules-Janssen" "fr")
(name-as-in "Prix Jules Janssen" "" "es")
(name-as-in "Prix Jules Janssen" "" "zh-sg")
(name-as-in "Prix Jules Janssen" "" "ja")
(name-as-in "Prix Jules Janssen" "" "zh-hans")
(name-as-in "Prix Jules Janssen" "" "zh-hant")

(descr-as-in "Prix Jules Janssen" "" "de")
(descr-as-in "Prix Jules Janssen" "" "zh-hk")
(descr-as-in "Prix Jules Janssen" "" "zh-tw")
(descr-as-in "Prix Jules Janssen" "" "ru")
(descr-as-in "Prix Jules Janssen" "" "pt")
(descr-as-in "Prix Jules Janssen" "" "en")
(descr-as-in "Prix Jules Janssen" "" "zh-cn")
(descr-as-in "Prix Jules Janssen" "" "fr")
(descr-as-in "Prix Jules Janssen" "" "es")
(descr-as-in "Prix Jules Janssen" "" "zh-sg")
(descr-as-in "Prix Jules Janssen" "" "ja")
(descr-as-in "Prix Jules Janssen" "" "zh-hans")
(descr-as-in "Prix Jules Janssen" "" "zh-hant")


(refer-to ["properties.named_after"])
(refer-to ["entities.pierre_janssen"])
(fact claim "Prix Jules Janssen" "named-after" "Pierre Janssen")
