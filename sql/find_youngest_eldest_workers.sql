SELECT 'youngest' AS type, name, birthday
FROM worker
    WHERE birthday IN (
	    SELECT birthday FROM worker
	    ORDER BY  birthday DESC
	    LIMIT 1
)
UNION
SELECT 'eldest' AS type, name, birthday FROM worker
    WHERE birthday IN (
	    SELECT birthday FROM worker
	    ORDER BY  birthday
	    LIMIT 1
);