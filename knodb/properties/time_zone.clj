(ns properties.time_zone
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "time-zone")

(name-as-in "time-zone" "Zeitzone" "de")
(name-as-in "time-zone" "" "zh-hk")
(name-as-in "time-zone" "" "zh-tw")
(name-as-in "time-zone" "часовой пояс" "ru")
(name-as-in "time-zone" "fuso horário" "pt")
(name-as-in "time-zone" "time zone" "en")
(name-as-in "time-zone" "时区" "zh-cn")
(name-as-in "time-zone" "fuseau horaire" "fr")
(name-as-in "time-zone" "huso horario" "es")
(name-as-in "time-zone" "" "zh-sg")
(name-as-in "time-zone" "標準時間帯" "ja")
(name-as-in "time-zone" "时区" "zh-hans")
(name-as-in "time-zone" "時區" "zh-hant")

(descr-as-in "time-zone" "Bezeichnung der Zonenzeit" "de")
(descr-as-in "time-zone" "" "zh-hk")
(descr-as-in "time-zone" "" "zh-tw")
(descr-as-in "time-zone" "статья про часовой пояс" "ru")
(descr-as-in "time-zone" "fuso horário para este local" "pt")
(descr-as-in "time-zone" "time zone for this location" "en")
(descr-as-in "time-zone" "" "zh-cn")
(descr-as-in "time-zone" "fuseau horaire pour ce lieu" "fr")
(descr-as-in "time-zone" "huso horario de este lugar" "es")
(descr-as-in "time-zone" "" "zh-sg")
(descr-as-in "time-zone" "この場所の標準時間帯" "ja")
(descr-as-in "time-zone" "" "zh-hans")
(descr-as-in "time-zone" "" "zh-hant")

