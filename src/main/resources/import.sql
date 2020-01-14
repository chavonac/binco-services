INSERT INTO usuarios (cve_usuario, password, nombre, email, activo, usuario, fecha_actualizacion) VALUES ('CHAVON','12345', 'SALVADOR ANTONIO AYALA CHAVEZ', 'chavon@msc.com', 'S', 'SYS', CURRENT_TIME);
INSERT INTO usuarios (cve_usuario, password, nombre, email, activo, usuario, fecha_actualizacion) VALUES ('CHECO' ,'12345', 'SERGIO VALLE ALARCON', 'checo@msc.com', 'S', 'SYS', CURRENT_TIME);

INSERT INTO funciones (cve_funcion, descripcion, orden, usuario, fecha_actualizacion) VALUES ('BINF001', 'PANTALLA DEMO 1', 1, 'SYS', CURRENT_TIME);
INSERT INTO funciones (cve_funcion, descripcion, orden, usuario, fecha_actualizacion) VALUES ('BINF002', 'PANTALLA DEMO 1', 2, 'SYS', CURRENT_TIME);

INSERT INTO usuarios_funciones (id_usuario, id_funcion) VALUES (1, 1);
INSERT INTO usuarios_funciones (id_usuario, id_funcion) VALUES (2, 2);