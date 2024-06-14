SELECT c.CountryName
FROM Countries c
JOIN CountryLanguages cl ON c.CountryCode = cl.CountryCode
WHERE cl.Language = 'Spanish';
