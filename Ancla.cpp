#include <GL/glut.h>

void reshape_cb (int w, int h) {
	if (w==0||h==0) return;
	glViewport(0,0,w,h);
	glMatrixMode (GL_PROJECTION);
	glLoadIdentity ();
	gluOrtho2D(0,w,0,h);
	glMatrixMode (GL_MODELVIEW);
	glLoadIdentity ();
}

void display_cb() {
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1,1,0); glLineWidth(3);
	glBegin(GL_LINE_STRIP);
	glVertex2i(320,0);
	glVertex2i(338.5,57);
	glVertex2i(505,57);
	glVertex2i(523.5,68.4);
	glVertex2i(560.5,91.2);
	glVertex2i(579,114);
	glVertex2i(597.5,171);
	glVertex2i(542,119.7);
	glVertex2i(564.2,119.7);
	glVertex2i(542,96.9);
	glVertex2i(505,85.5);
	glVertex2i(394,91.2);
	glVertex2i(375.5,171);
	glVertex2i(353.3,342);
	glVertex2i(505,347.7);
	glVertex2i(505,370.5);
	glVertex2i(353.3,376.2);
	glVertex2i(349.6,410.4);
	glVertex2i(350.71,412.11);
	glVertex2i(351.82,413.82);
	glVertex2i(352.93,415.53);
	glVertex2i(354.04,417.24);
	glVertex2i(355.15,418.95);
	glVertex2i(356.26,420.66);
	glVertex2i(357.37,422.37);
	glVertex2i(358.48,424.08);
	glVertex2i(359.59,425.79);
	glVertex2i(360.7,427.499999999999);
	glVertex2i(361.07,429.21);
	glVertex2i(361.44,430.920000000001);
	glVertex2i(361.81,432.630000000001);
	glVertex2i(360.7,434.340000000002);
	glVertex2i(359.59,436.050000000002);
	glVertex2i(358.48,437.760000000003);
	glVertex2i(356.26,441.180000000004);
	glVertex2i(354.04,444.600000000005);
	glVertex2i(352.93,446.310000000006);
	glVertex2i(350.71,449.730000000007);
	glVertex2i(349.6,451.440000000007);
	glVertex2i(348.49,453.150000000008);
	glVertex2i(346.27,456.570000000009);
	glVertex2i(345.16,458.28000000001);
	glVertex2i(340.720000000001,465.120000000012);
	glVertex2i(338.500000000001,468.540000000013);
	glVertex2i(336.280000000001,471.960000000014);
	glVertex2i(335.170000000001,473.670000000015);
	glVertex2i(331.1,475.380000000015);
	glVertex2i(327.4,477.090000000016);
	glVertex2i(320,478.800000000017);
	glVertex2i(312.6,477.090000000016);
	glVertex2i(308.9,475.380000000015);
	glVertex2i(304.829999999999,473.670000000015);
	glVertex2i(303.719999999999,471.960000000014);
	glVertex2i(302.609999999999,470.250000000014);
	glVertex2i(301.499999999999,468.540000000013);
	glVertex2i(299.279999999999,465.120000000012);
	glVertex2i(295.95,459.99000000001);
	glVertex2i(294.84,458.28000000001);
	glVertex2i(293.73,456.570000000009);
	glVertex2i(291.51,453.150000000008);
	glVertex2i(290.4,451.440000000007);
	glVertex2i(289.29,449.730000000007);
	glVertex2i(287.07,446.310000000006);
	glVertex2i(285.96,444.600000000005);
	glVertex2i(283.74,441.180000000004);
	glVertex2i(281.52,437.760000000003);
	glVertex2i(280.41,436.050000000002);
	glVertex2i(279.3,434.340000000002);
	glVertex2i(278.19,432.630000000001);
	glVertex2i(278.56,430.920000000001);
	glVertex2i(278.93,429.21);
	glVertex2i(279.3,427.499999999999);
	glVertex2i(280.41,425.79);
	glVertex2i(281.52,424.08);
	glVertex2i(282.63,422.37);
	glVertex2i(283.74,420.66);
	glVertex2i(284.85,418.95);
	glVertex2i(285.96,417.24);
	glVertex2i(287.07,415.53);
	glVertex2i(288.18,413.82);
	glVertex2i(289.29,412.11);
	glVertex2i(290.4,410.4);
	glVertex2i(286.7,376.2);
	glVertex2i(135,370.5);
	glVertex2i(135,347.7);
	glVertex2i(286.7,342);
	glVertex2i(264.5,171);
	glVertex2i(246,91.2);
	glVertex2i(135,85.5);
	glVertex2i(98,96.9);
	glVertex2i(75.8,119.7);
	glVertex2i(98,119.7);
	glVertex2i(42.5,171);
	glVertex2i(61,114);
	glVertex2i(79.5,91.2);
	glVertex2i(116.5,68.4);
	glVertex2i(135,57);
	glVertex2i(301.5,57);
	glVertex2i(320,0);
	glEnd();
	glutSwapBuffers();
}

void initialize() {
	glutInitDisplayMode (GLUT_RGBA|GLUT_DOUBLE);
	glutInitWindowSize (640,480);
	glutInitWindowPosition (100,100);
	glutCreateWindow ("Ventana OpenGL");
	glutDisplayFunc (display_cb);
	glutReshapeFunc (reshape_cb);
	glClearColor(1.f,1.f,1.f,1.f);
}

int main (int argc, char **argv) {
	glutInit (&argc, argv);
	initialize();
	glutMainLoop();
	return 0;
}

