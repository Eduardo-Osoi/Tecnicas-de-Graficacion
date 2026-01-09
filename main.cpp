#ifdef __APPLE__
# include <OpenGL/gl.h>
# include <OpenGL/glu.h>
# include <GLUT/glut.h>
#else
# include <GL/gl.h>
# include <GL/glu.h>
# include <GL/glut.h>
#endif
GLfloat elevacion = 90.0f;
GLfloat azimitud = 140.0f;
GLfloat giro = .0f;
//parametros para construir la grilla
#define DEF_floorGridScale 1.0
#define DEF_floorGridXSteps 4.0
#define DEF_floorGridZSteps 4.0
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
void display (void)
{
	
	
	//Defino un material Azul
	GLfloat mat_ambient_verde[] = { 0.0215f, 0.1745f, 0.0215f, 0.55f };
	GLfloat mat_diffuse_verde[] = {0.07568f, 0.61424f, 0.07568f, 0.55f };
	GLfloat mat_specular_verde[] = {0.633f, 0.727811f, 0.633f, 0.55f};
	
	GLfloat mat_ambient_negro[] = { 0.05375f, 0.05f, 0.06625f, 0.82f  };
	GLfloat mat_diffuse_negro[] = { 0.18275f, 0.17f, 0.22525f, 0.82f };
	GLfloat mat_specular_negro[] = {0.332741f, 0.328634f, 0.346435f, 0.82f };
	
	GLfloat zExtent, xExtent, xLocal, zLocal;
	int loopX, loopZ;
	glClear (GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	glMatrixMode( GL_MODELVIEW_MATRIX );
	glLoadIdentity();
	polarView(20.0f, giro, elevacion, azimitud);

	
	//Dibuja el cubo
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_negro);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_negro);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_negro);
	glMaterialf (GL_FRONT, GL_SHININESS, 38.4f);
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	glMaterialfv (GL_FRONT, GL_AMBIENT, mat_ambient_verde);
	glMaterialfv (GL_FRONT, GL_DIFFUSE, mat_diffuse_verde);
	glMaterialfv (GL_FRONT, GL_SPECULAR, mat_specular_verde);
	glMaterialf (GL_FRONT, GL_SHININESS, 76.8f);
	
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 3.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//-------------------------
	glPushMatrix ();
	glTranslatef (3.5, 3.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//-------------------------
	
	glPushMatrix ();
	glTranslatef (3.5, 3.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	//--------------------------
	glPushMatrix ();
	glTranslatef (3.5, 3.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//-------------------------
	
	glPushMatrix ();
	glTranslatef (3.5, 3.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//---------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (3.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//-------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//----------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//---------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//-------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//----------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//-----------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//--------------------------------------
	glPushMatrix ();
	glTranslatef (3.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 0.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//---------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//----------------------------------------------------------------
	
	glPushMatrix ();
	glTranslatef (-2.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//----------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//---------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -1.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//---------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -2.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//----------------------------------------------------------------------
	
	glPushMatrix ();
	glTranslatef (-2.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -3.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (2.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (0.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 0.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -1.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -2.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -3.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, 4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	//--------------------------------------------------------------------------
	//--------------------------------------------------------------------------
	
	
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -3.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -2.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -1.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 0.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 1.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 2.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, 3.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (3.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (2.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (2.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (1.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (1.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (0.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (0.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-0.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-1.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-2.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	//--------------------------------------------------------------------------
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, 3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, 2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, 1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, 0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, -0.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, -1.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, -2.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	glPushMatrix ();
	glTranslatef (-3.5, -4.0, -3.5);
	glRotatef(0.0, 0.0, 0.0, 0.0);
	glutSolidCube (1.0);
	glPopMatrix ();
	
	
	
	
	
	glFlush ();
	glutSwapBuffers();
}
void reshape(int w, int h)
{
	glViewport (0, 0, (GLsizei) w, (GLsizei) h);
	glMatrixMode (GL_PROJECTION);
	glLoadIdentity ();
	gluPerspective(40, (GLfloat) w/(GLfloat) h, 1.0, 200.0);
	glMatrixMode (GL_MODELVIEW);
}
void keyboard(unsigned char key, int x, int y)
{
	switch (key) {
	case 'x':
	case 'X':
		elevacion = elevacion + 10.0f;
		glutPostRedisplay();
		break;
	case 'v':
	case 'V':
		elevacion = elevacion - 10.0f;
		glutPostRedisplay();
		break;
	case 'y':
	case 'Y':
		azimitud = azimitud + 10.0f;
		glutPostRedisplay();
		break;
	case 'u':
	case 'U':
		azimitud = azimitud - 10.0f;
		glutPostRedisplay();
		break;
	case 'z':
	case 'Z':
		giro = giro + 10.0f;
		glutPostRedisplay();
		break;
	case 'c':
	case 'C':
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
	glutInitWindowSize(1080, 720);
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutCreateWindow(argv[0]);
	init();
	glutReshapeFunc(reshape);
	glutKeyboardFunc(keyboard);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}
