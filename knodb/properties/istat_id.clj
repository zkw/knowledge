(ns properties.istat_id
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "istat-id")

(name-as-in "istat-id" "" "zh-hant")
(name-as-in "istat-id" "" "zh-hans")
(name-as-in "istat-id" "код ISTAT" "ru")
(name-as-in "istat-id" "" "pt")
(name-as-in "istat-id" "identifiant ISTAT" "fr")
(name-as-in "istat-id" "ISTAT ID" "es")
(name-as-in "istat-id" "ISTATコード" "ja")
(name-as-in "istat-id" "ISTAT-ID" "de")
(name-as-in "istat-id" "ISTAT ID" "en")

(descr-as-in "istat-id" "" "zh-hant")
(descr-as-in "istat-id" "" "zh-hans")
(descr-as-in "istat-id" "" "ru")
(descr-as-in "istat-id" "" "pt")
(descr-as-in "istat-id" "code commune en Italie" "fr")
(descr-as-in "istat-id" "código identificador para los municipios italianos" "es")
(descr-as-in "istat-id" "イタリアの自治体の識別コード" "ja")
(descr-as-in "istat-id" "vom staatlichen italienischen Statistikamt vergebene Identifikationsnummer für Gemeinden" "de")
(descr-as-in "istat-id" "identification of municipalities in Italy" "en")

