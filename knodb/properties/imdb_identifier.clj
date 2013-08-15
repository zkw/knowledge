(ns properties.imdb_identifier
   (:refer-clojure :exclude [==])
   (:use clojure.core.logic)
   (:use meta.meta))

(fact Property "imdb-identifier")

(name-as-in "imdb-identifier" "IMDb 編號" "zh-hant")
(name-as-in "imdb-identifier" "IMDb编号" "zh-hans")
(name-as-in "imdb-identifier" "идентификатор IMDb" "ru")
(name-as-in "imdb-identifier" "identificador IMDb" "pt")
(name-as-in "imdb-identifier" "identifiant IMDb" "fr")
(name-as-in "imdb-identifier" "identificador IMDb" "es")
(name-as-in "imdb-identifier" "IMDb識別子" "ja")
(name-as-in "imdb-identifier" "IMDb-Identifikationsnummer" "de")
(name-as-in "imdb-identifier" "IMDb identifier" "en")

(descr-as-in "imdb-identifier" "互聯網電影數據庫（IMDB）編號，前綴為（tt-, nm-, ch-, co-）" "zh-hant")
(descr-as-in "imdb-identifier" "互联网电影数据库（IMDB）编号，前缀为（tt-, nm-, ch-, co-）" "zh-hans")
(descr-as-in "imdb-identifier" "идентификатор" "ru")
(descr-as-in "imdb-identifier" "identificador do Internet Movie Database (IMDb) com o prefixo (tt- nm- ch- co-)" "pt")
(descr-as-in "imdb-identifier" "identifiant Internet Movie Database (IMDb) avec un préfixe (tt-, nm-, ch-, co-)" "fr")
(descr-as-in "imdb-identifier" "identificador para la Internet Movie Database (IMDb) con prefijo (tt- nm- ch- co-)" "es")
(descr-as-in "imdb-identifier" "インターネット・ムービー・データベース（IMDb）のtt、nm、ch、coで始まる識別子" "ja")
(descr-as-in "imdb-identifier" "Identifikationsnummer in der Internet Movie Database (IMDb) inklusive Präfix (tt-, nm-, ch-, co-)" "de")
(descr-as-in "imdb-identifier" "identification code from the Internet Movie Database (IMDb) with prefix (tt-, nm-, ch-, co-)" "en")
