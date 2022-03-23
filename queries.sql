## Part 1: Test it with SQL
SHOW FIELDS FROM job;

## Part 2: Test it with SQL
SELECT *
FROM employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT skill.name, skill.description
FROM skill
JOIN job_skills ON skill.id = job_skills.skills_id
ORDER BY skill.name;