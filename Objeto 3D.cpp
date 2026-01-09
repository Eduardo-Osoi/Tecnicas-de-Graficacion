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
	GLfloat light_specular[] = { 1.0, 1.0, 1.0, 1.0 };
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
	//Defino toro
	GLfloat mat_ambient_toro[] ={ 0.0f,0.0f,0.0f,1.0f};
	GLfloat mat_diffuse_toro[] ={0.1f,0.35f,0.1f,1.0f };
	GLfloat mat_specular_toro[] ={0.1f,0.35f,0.1f,1.0f };
	float shine_toro = 32.0f;
	//Defino cubo
	GLfloat mat_ambient_cubo[] ={0.0f, 0.0f, 0.0f, 1.0f };
	GLfloat mat_diffuse_cubo[] ={0.01f, 0.01f, 0.01f, 1.0f};
	GLfloat mat_specular_cubo[]  ={0.50f, 0.50f, 0.50f, 1.0f };
	float shine_cubo = 20.264f;
	//Defino tetera
	GLfloat mat_ambient_esfera[] ={ 0.0f,0.1f,0.06f ,1.0f };
	GLfloat mat_diffuse_esfera[] ={0.0f,0.50980392f,0.50980392f,1.0f };
	GLfloat mat_specular_esfera[]  ={0.50196078f,0.50196078f,0.50196078f,1.0f };
	float shine_esfera=32.0f ;
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
	glColor3f( 0.0, 0.7, 0.7 );
	glBegin( GL_LINES );
	zExtent = DEF_floorGridScale * DEF_floorGridZSteps;
	for(loopX = -DEF_floorGridXSteps; loopX <= DEF_floorGridXSteps; loopX++ )
	{
		xLocal = DEF_floorGridScale * loopX;
		glVertex3f( xLocal, 0.0, -zExtent );
		glVertex3f( xLocal, 0.0, zExtent );
	}
	xExtent = DEF_floorGridScale * DEF_floorGridXSteps;
	for(loopZ = -DEF_floorGridZSteps; loopZ <= DEF_floorGridZSteps; loopZ++ )
	{
		zLocal = DEF_floorGridScale * loopZ;
		glVertex3f( -xExtent, 0.0, zLocal );
		glVertex3f( xExtent, 0.0, zLocal );
	}
	glEnd();
	glPopAttrib();
	glPopMatrix();
	//Dibuja el Toro
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_toro);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_toro);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_toro);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_toro);
	glPushMatrix ();
	glTranslatef (-3.0, 1.0, 1.25);
	glRotatef(-45.0, 0.0, 1.0, 0.0);
	glRotatef(-45.0, 1.0, 0.0, 0.0);
	glutSolidIcosahedron ();
	glPopMatrix ();
	//Dibuja el cubo
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_cubo);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_cubo);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_cubo);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_cubo);
	glPushMatrix ();
	glTranslatef (1.0, 0.7, 1.0);
	glRotatef(15.0, 0.0, 1.0, 0.0);
	glutSolidTetrahedron ();
	glPopMatrix ();
	//Dibuja la esfera de radio 2.5
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_esfera);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_esfera);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_esfera);
	glMaterialf (GL_FRONT, GL_SHININESS, shine_esfera);
	glPushMatrix ();
	glTranslatef (-1.0, 1.0, 0.0);
	glutSolidDodecahedron ();
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
	case 'q':
	case 'Q':
		azimitud = azimitud + 10.0f;
		glutPostRedisplay();
		break;
	case 'e':
	case 'E':
		azimitud = azimitud - 10.0f;
		glutPostRedisplay();
		break;
	case 'a':
	case 'A':
		giro = giro + 10.0f;
		glutPostRedisplay();
		break;
	case 'd':
	case 'D':
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
	glutInitWindowSize(300, 300);
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
