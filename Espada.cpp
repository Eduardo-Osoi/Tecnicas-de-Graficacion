#ifdef __APPLE__
# include <OpenGL/gl.h>
# include <OpenGL/glu.h>
# include <GLUT/glut.h>
#else
# include <GL/gl.h>
# include <GL/glu.h>
# include <GL/glut.h>
#endif
int grab_pos_x=0;
int grab_pos_y=0;
float anglex=0.0;
float angley=0.0;
GLfloat elevacion = 0.0f;
GLfloat azimitud = 0.0f;
GLfloat giro = 0.0f;
//parametros para construir la grilla
#define DEF_floorGridScale 1.0
#define DEF_floorGridXSteps 10.0
#define DEF_floorGridZSteps 10.0

void polarView(GLfloat distance, GLfloat twist, GLfloat elevation, GLfloat azimuth)
{
	glTranslated(0.0, 0.0, -distance);
	glRotated(-twist, 0.0, 0.0, 1.0);
	glRotated(-elevation, 1.0, 0.0, 0.0);
	glRotated(azimuth, 0.0, 0.0, 1.0);
}
//Inicializa las propiedades de la fuente de luz
static void init(void)
{
	GLfloat light_ambient[] = { 0.75, 0.75, 0.75, 1.0 };
	GLfloat light_diffuse[] = { 1.0, 1.0, 1.0, 1.0 };
	GLfloat light_specular[] = { 0.5, 0.5, 0.5, 0.5 };
	GLfloat light_position[] = { 0.0, 0.0, 1.0, 0.0 };
	glLightfv (GL_LIGHT0, GL_AMBIENT, light_ambient);
	glLightfv (GL_LIGHT0, GL_DIFFUSE, light_diffuse);
	glLightfv (GL_LIGHT0, GL_SPECULAR, light_specular);
	glLightfv (GL_LIGHT0, GL_POSITION, light_position);
	glEnable (GL_LIGHTING);
	glEnable (GL_LIGHT0);
	glDepthFunc(GL_LESS);
	glEnable(GL_DEPTH_TEST);
}

void draw(){
	glClear(GL_COLOR_BUFFER_BIT| GL_DEPTH_BUFFER_BIT);
	glPushMatrix();
	glRotatef(anglex,0,1,0);
	glRotatef(-angley,1,0,0);
	glutSolidTeapot(1.0);
	glPopMatrix();
	glFlush();
	glutSwapBuffers();
}

void display (void)
{
	//Defino cubos dorados
	GLfloat mat_ambient_cubo1[] ={ 0.24725, 0.1995, 0.0745};
	GLfloat mat_diffuse_cubo1[] ={0.751640, 0.60648, 0.226480};
	GLfloat mat_specular_cubo1[]  ={0.628281, 0.555802, 0.366065};
	float shine_cubo1= 0.4;
	//Defino cubos negros
	GLfloat mat_ambient_cubo2[] ={ 0.02, 0.02, 0.02};
	GLfloat mat_diffuse_cubo2[] ={0.01, 0.01, 0.1};
	GLfloat mat_specular_cubo2[]  ={0.4, 0.4, 0.4};
	float shine_cubo2= 0.078125;
	GLfloat zExtent, xExtent, xLocal, zLocal;
	int loopX, loopZ;
	glClear (GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glMatrixMode( GL_MODELVIEW_MATRIX );
	glLoadIdentity();
	polarView(15.0f, giro, elevacion, azimitud);
	//Dibujo la Grilla
	glPushMatrix();
	glPushAttrib( GL_LIGHTING_BIT );
	glDisable( GL_LIGHTING );
	glColor3f( 0.4, 0.4, 0.9 );
	glBegin( GL_LINES );
	zExtent = DEF_floorGridScale * DEF_floorGridZSteps;
	for(loopX = -DEF_floorGridXSteps; loopX <= DEF_floorGridXSteps; loopX++ )
	{
		xLocal = DEF_floorGridScale * loopX;
		glVertex3f( xLocal, -2.5, -zExtent );
		glVertex3f( xLocal, -2.5, zExtent );
	}
	xExtent = DEF_floorGridScale * DEF_floorGridXSteps;
	for(loopZ = -DEF_floorGridZSteps; loopZ <= DEF_floorGridZSteps; loopZ++ )
	{
		zLocal = DEF_floorGridScale * loopZ;
		glVertex3f( -xExtent, -2.5, zLocal );
		glVertex3f( xExtent, -2.5, zLocal );
	}
	glEnd();
	glPopAttrib();
	glPopMatrix();
	//Dibujando P1
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo2);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo2);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo2);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo2);
	glPushMatrix ();
	glTranslatef (0.21, 0.0, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.8);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo2);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo2);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo2);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo2);
	glPushMatrix ();
	glTranslatef (1.0, 0.0, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo2);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo2);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo2);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo2);
	glPushMatrix ();
	glTranslatef (1.8, 0.0, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.8);
	glPopMatrix ();
	//Dibujando P2
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo2);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo2);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo2);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo2);
	glPushMatrix ();
	glTranslatef (1.0, -0.8, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.8);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo2);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo2);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo2);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo2);
	glPushMatrix ();
	glTranslatef (1.0, -1.6, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.8);
	glPopMatrix ();
	//Dibujando P3
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 0.9, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.9);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 1.7, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.8);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 2.4, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.7);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 3.0, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.6);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 3.5, 1.0);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (0.5);
	glPopMatrix ();
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo1);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo1);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo1);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo1);
	glPushMatrix ();
	glTranslatef (1.0, 3.9, 1.0);
	glRotatef(0.0, 100.0, 0.0, 0.0);
	glutSolidCube (0.4);
	glPopMatrix ();
	glFlush ();
	glutSwapBuffers();
}

void reshape(int w, int h)
{
	glViewport (0, 0, (GLsizei) w, (GLsizei) h);
	glMatrixMode (GL_PROJECTION);
	glLoadIdentity ();
	gluPerspective(30, (GLfloat) w/(GLfloat) h, 1.0, 200.0);
	glMatrixMode (GL_MODELVIEW);
}

void mouse(int btn, int state, int x, int y){
	grab_pos_x=x;
	grab_pos_y=y;
}
	
void mouseMotion(int x, int y){
	anglex +=(x-grab_pos_x)/2.0;
	if(anglex>360.0)
		anglex -=360.0;
	else if(anglex < -360.0)
		angley += 360.0;
	angley +=(y-grab_pos_y)/2.0;
	if(angley>360.0)
		angley -=360.0;
	else if(angley < -360.0)
		angley += 360.0;
	grab_pos_x=x;
	grab_pos_y=y;
	glutPostRedisplay();
	}

void keyboard(unsigned char key, int x, int y)
{
	switch (key) {
	case 's':
	case 'S':
		elevacion = elevacion + 10.0f;
		glutPostRedisplay();
		break;
	case 'w':
	case 'W':
		elevacion = elevacion - 10.0f;
		glutPostRedisplay();
		break;
	case 'd':
	case 'D':
		azimitud = azimitud + 10.0f;
		glutPostRedisplay();
		break;
	case 'a':
	case 'A':
		azimitud = azimitud - 10.0f;
		glutPostRedisplay();
		break;
	case 'z':
	case 'Z':
		giro = giro + 10.0f;
		glutPostRedisplay();
		break;
	case 'x':
	case 'X':
		giro = giro - 10.0f;
		glutPostRedisplay();
		break;
	case 27:
		exit(0);
		break;
	}
}

int main(int argc, char **argv)
{
	glutInitWindowSize(900, 1000);
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutCreateWindow(argv[0]);
	init();
	glutDisplayFunc(draw);
	glutMouseFunc(mouse);
	glutMotionFunc(mouseMotion);
	glutReshapeFunc(reshape);
	glutKeyboardFunc(keyboard);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}
