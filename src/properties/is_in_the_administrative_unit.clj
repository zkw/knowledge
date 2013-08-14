(ns properties.is_in_the_administrative_unit
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "is-in-the-administrative-unit")

(name-as-in "is-in-the-administrative-unit" "所在行政區" "zh-hant")
(name-as-in "is-in-the-administrative-unit" "隶属行政区划" "zh-hans")
(name-as-in "is-in-the-administrative-unit" "находится в административной единице" "ru")
(name-as-in "is-in-the-administrative-unit" "unidade administrativa" "pt")
(name-as-in "is-in-the-administrative-unit" "situé dans l'entité administrative de" "fr")
(name-as-in "is-in-the-administrative-unit" "situado en la unidad administrativa" "es")
(name-as-in "is-in-the-administrative-unit" "位置する行政区画" "ja")
(name-as-in "is-in-the-administrative-unit" "liegt in der Verwaltungseinheit" "de")
(name-as-in "is-in-the-administrative-unit" "is in the administrative unit" "en")

(descr-as-in "is-in-the-administrative-unit" "該事物所在的行政區" "zh-hant")
(descr-as-in "is-in-the-administrative-unit" "该事物所在的行政区" "zh-hans")
(descr-as-in "is-in-the-administrative-unit" "вышестоящая единица, на территории которой расположен данный элемент" "ru")
(descr-as-in "is-in-the-administrative-unit" "o item situa-se no território da seguinte unidade administrativa" "pt")
(descr-as-in "is-in-the-administrative-unit" "unité administrative où se situe l'élément" "fr")
(descr-as-in "is-in-the-administrative-unit" "el elemento se encuentra en el territorio de la entidad administrativa siguiente" "es")
(descr-as-in "is-in-the-administrative-unit" "この項目が位置している行政区画" "ja")
(descr-as-in "is-in-the-administrative-unit" "Bezeichnung der nächsthöheren Verwaltungsebene. Ort an dem Ereignis stattfindet." "de")
(descr-as-in "is-in-the-administrative-unit" "the item is located on the territory of the following administrative unit" "en")

