(ns properties.continent
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "continent")

(name-as-in "continent" "大洲" "zh-hant")
(name-as-in "continent" "洲" "zh-hans")
(name-as-in "continent" "на континенте" "ru")
(name-as-in "continent" "continente" "pt")
(name-as-in "continent" "continent" "fr")
(name-as-in "continent" "continente" "es")
(name-as-in "continent" "大陸" "ja")
(name-as-in "continent" "Kontinent" "de")
(name-as-in "continent" "continent" "en")

(descr-as-in "continent" "項目所在的大洲" "zh-hant")
(descr-as-in "continent" "对象所在的洲" "zh-hans")
(descr-as-in "continent" "континент, частью которого является этот элемент" "ru")
(descr-as-in "continent" "continente onde o item está localizado" "pt")
(descr-as-in "continent" "continent terrestre sur lequel se situe l'objet" "fr")
(descr-as-in "continent" "continente donde se ubica el elemento" "es")
(descr-as-in "continent" "" "ja")
(descr-as-in "continent" "der Erdteil, auf dem sich das Objekt befindet" "de")
(descr-as-in "continent" "continent of which the subject is a part" "en")

