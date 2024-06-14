SELECT CountryName, COUNT(*) AS NumberOfOfficialLanguages
FROM CountryLanguages
GROUP BY CountryName;
