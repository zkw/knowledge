(ns properties.country
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "country")

(name-as-in "country" "國家" "zh-hant")
(name-as-in "country" "国家" "zh-hans")
(name-as-in "country" "страна" "ru")
(name-as-in "country" "país" "pt")
(name-as-in "country" "pays" "fr")
(name-as-in "country" "país" "es")
(name-as-in "country" "国" "ja")
(name-as-in "country" "Staat" "de")
(name-as-in "country" "country" "en")

(descr-as-in "country" "項目所屬的主權國" "zh-hant")
(descr-as-in "country" "项目所属的主权国" "zh-hans")
(descr-as-in "country" "суверенное государство этого элемента" "ru")
(descr-as-in "country" "país ao qual o item pertence" "pt")
(descr-as-in "country" "État souverain de  cet élément" "fr")
(descr-as-in "country" "Estado soberano de este elemento" "es")
(descr-as-in "country" "" "ja")
(descr-as-in "country" "souveräner Staat, in dem sich das Objekt befindet" "de")
(descr-as-in "country" "sovereign state of this item" "en")

