(ns properties.subclass_of
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "subclass-of")

(name-as-in "subclass-of" "上一級分類" "zh-hant")
(name-as-in "subclass-of" "父类" "zh-hans")
(name-as-in "subclass-of" "подкласс от" "ru")
(name-as-in "subclass-of" "subclasse de" "pt")
(name-as-in "subclass-of" "sous-classe de" "fr")
(name-as-in "subclass-of" "subclase de" "es")
(name-as-in "subclass-of" "上位分類" "ja")
(name-as-in "subclass-of" "ist eine Unterklasse von" "de")
(name-as-in "subclass-of" "subclass of" "en")

(descr-as-in "subclass-of" "" "zh-hant")
(descr-as-in "subclass-of" "" "zh-hans")
(descr-as-in "subclass-of" "присоединяет к элементу список гиперонимов - более широких понятий, чем этот элемент" "ru")
(descr-as-in "subclass-of" "" "pt")
(descr-as-in "subclass-of" "X sous-classe de Y : tous les items qui sont des instances (exemples) de X sont aussi des items instances de Y" "fr")
(descr-as-in "subclass-of" "este elemento es una clase de aquel otro" "es")
(descr-as-in "subclass-of" "この項目を下位分類とする上位の分類・概念" "ja")
(descr-as-in "subclass-of" "dieses Element ist eine Klasse/Gruppe jenes Elements. Beispiel: Auto ist eine Unterklasse von Fahrzeug" "de")
(descr-as-in "subclass-of" "all of these items are instances of those items; this item is a class of that item" "en")

