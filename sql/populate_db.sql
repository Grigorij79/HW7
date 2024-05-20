INSERT INTO worker (id, name, birthday, level, salary) VALUES
(1, 'Artem Dovbyk', '1997-04-24', 'Trainee', 800),
(2, 'Volodymyr Brazhko', '1969-05-22', 'Junior', 1100),
(3, 'Oleksii Hutsuliak', '1987-07-06', 'Middle', 2100),
(4, 'Mykhailo Mudryk', '1995-02-03', 'Middle', 2100),
(5, 'Georgiy Sudakov', '1997-04-24', 'Senior', 5300),
(6, 'Mykola Shaparenko', '1989-04-06', 'Senior', 5350),
(7, 'Ruslan Malinovsky', '1987-04-22', 'Senior', 5350),
(8, 'Oleksandr Zinchenko', '1978-04-12', 'Senior', 5500),
(9, 'Maksym Talovierov', '1977-09-29', 'Senior', 5400),
(10, 'Illia Zabarnyi', '1978-07-16', 'Senior', 5500);

INSERT INTO client (id, name) VALUES
(1, 'Vitalii Mykolenko'),
(2, 'Mykola Matvienko'),
(3, 'Anatoliy Trubin'),
(4, 'Georgiy Bushchan'),
(5, 'Andriy Lunin');

INSERT INTO project(id, client_id, start_date,finish_date) VALUES
(1, 5, '2024-04-01', '2024-05-01'),
(2, 1, '2024-04-01', '2024-06-01'),
(3, 2, '2024-04-01', '2026-08-01'),
(4, 2, '2024-04-01', '2024-10-01'),
(5, 3, '2024-04-01', '2025-05-01'),
(6, 4, '2024-04-01', '2026-05-01'),
(7, 4, '2024-04-01', '2027-05-01'),
(8, 4, '2024-04-01', '2027-05-01'),
(9, 5, '2024-04-01', '2029-05-01'),
(10,5, '2024-04-01', '2032-05-01');

INSERT INTO project_worker (project_id, worker_id) VALUES
(1, 8),
(1, 1),
(2, 10),
(2, 3),
(2, 6),
(3, 2),
(3, 4),
(3, 5),
(3, 6),
(4, 2),
(4, 7),
(4, 8),
(5, 3),
(5, 9),
(5, 10),
(5, 1),
(5, 4),
(6, 5),
(6, 6),
(6, 7),
(7, 8),
(7, 9),
(7, 10),
(8, 2),
(8, 3),
(8, 4),
(8, 5),
(9, 6),
(9, 7),
(9, 8),
(9, 9),
(10, 1),
(10, 2),
(10, 8),
(10, 9),
(10, 10);