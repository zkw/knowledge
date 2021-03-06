(ns properties.alma_mater
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "alma-mater")

(name-as-in "alma-mater" "Alma Mater" "de")
(name-as-in "alma-mater" "" "zh-hk")
(name-as-in "alma-mater" "" "zh-tw")
(name-as-in "alma-mater" "учебное заведение" "ru")
(name-as-in "alma-mater" "alma mater" "pt")
(name-as-in "alma-mater" "alma mater" "en")
(name-as-in "alma-mater" "母校" "zh-cn")
(name-as-in "alma-mater" "scolarité" "fr")
(name-as-in "alma-mater" "alma máter" "es")
(name-as-in "alma-mater" "" "zh-sg")
(name-as-in "alma-mater" "出身校" "ja")
(name-as-in "alma-mater" "母校" "zh-hans")
(name-as-in "alma-mater" "母校" "zh-hant")

(descr-as-in "alma-mater" "von der Person besuchte Universität" "de")
(descr-as-in "alma-mater" "" "zh-hk")
(descr-as-in "alma-mater" "" "zh-tw")
(descr-as-in "alma-mater" "учебное заведение, в котором учился человек" "ru")
(descr-as-in "alma-mater" "estabelecimento educacional frequentado" "pt")
(descr-as-in "alma-mater" "educational institution attended by the subject" "en")
(descr-as-in "alma-mater" "" "zh-cn")
(descr-as-in "alma-mater" "établissement éducatif fréquenté" "fr")
(descr-as-in "alma-mater" "institución educativa frecuentada por el elemento" "es")
(descr-as-in "alma-mater" "" "zh-sg")
(descr-as-in "alma-mater" "" "ja")
(descr-as-in "alma-mater" "" "zh-hans")
(descr-as-in "alma-mater" "" "zh-hant")

