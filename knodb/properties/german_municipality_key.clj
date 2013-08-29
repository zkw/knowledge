(ns properties.german_municipality_key
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "german-municipality-key")

(name-as-in "german-municipality-key" "德國直轄市編號" "zh-hant")
(name-as-in "german-municipality-key" "德国直辖市编号" "zh-hans")
(name-as-in "german-municipality-key" "идентификатор муниципалитетов в Германии" "ru")
(name-as-in "german-municipality-key" "" "pt")
(name-as-in "german-municipality-key" "numéro de municipalité allemande" "fr")
(name-as-in "german-municipality-key" "número de municipio alemán" "es")
(name-as-in "german-municipality-key" "ドイツ自治体キー" "ja")
(name-as-in "german-municipality-key" "Amtlicher Gemeindeschlüssel" "de")
(name-as-in "german-municipality-key" "German municipality key" "en")

(descr-as-in "german-municipality-key" "" "zh-hant")
(descr-as-in "german-municipality-key" "" "zh-hans")
(descr-as-in "german-municipality-key" "последовательность цифр, идентифицирующая муниципалитеты и городы в Германии" "ru")
(descr-as-in "german-municipality-key" "" "pt")
(descr-as-in "german-municipality-key" "" "fr")
(descr-as-in "german-municipality-key" "" "es")
(descr-as-in "german-municipality-key" "ドイツの自治体や独立した町を識別するための数字列" "ja")
(descr-as-in "german-municipality-key" "für kreisfreie Städte und Kommunen in Deutschland" "de")
(descr-as-in "german-municipality-key" "idendifier for municipalities and independent towns in Germany" "en")

