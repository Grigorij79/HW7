SELECT project_id AS name, SUM(salary * DATEDIFF (MONTH, start_date, finish_date)) AS price
FROM project_worker
    JOIN worker ON worker_id = worker.id
    JOIN project ON project.id = project_id
        GROUP BY project_id
        ORDER BY price DESC
;

