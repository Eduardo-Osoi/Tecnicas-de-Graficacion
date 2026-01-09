
package tgraficacion;
import java.awt.*;
/**
 *
 * @author Jose Eduardo Madrigal Osorio
 * 
 */

public class ProyectoFinal extends javax.swing.JFrame {
      Rectangulo rec;
      Circulo c;
      
      int [][] imagen = {
{1,1,255,255,255},
{1,2,255,255,255},
{1,3,255,255,255},
{1,4,255,255,255},
{1,5,255,255,255},
{1,6,255,255,255},
{1,7,255,255,255},
{1,8,255,255,255},
{1,9,255,255,255},
{1,10,255,255,255},
{1,11,255,255,255},
{1,12,255,255,255},
{1,13,0,0,0},
{1,14,0,0,0},
{1,15,0,0,0},
{1,16,0,0,0},
{1,17,255,255,255},
{1,18,255,255,255},
{1,19,255,255,255},
{1,20,255,255,255},
{1,21,255,255,255},
{2,1,255,255,255},
{2,2,255,255,255},
{2,3,255,255,255},
{2,4,255,255,255},
{2,5,255,255,255},
{2,6,255,255,255},
{2,7,255,255,255},
{2,8,255,255,255},
{2,9,255,255,255},
{2,10,255,255,255},
{2,11,255,255,255},
{2,12,0,0,0},
{2,13,255,255,255},
{2,14,151,71,6},
{2,15,151,71,6},
{2,16,151,71,6},
{2,17,0,0,0},
{2,18,255,255,255},
{2,19,255,255,255},
{2,20,255,255,255},
{2,21,255,255,255},
{3,1,255,255,255},
{3,2,255,255,255},
{3,3,255,255,255},
{3,4,255,255,255},
{3,5,255,255,255},
{3,6,255,255,255},
{3,7,255,255,255},
{3,8,255,255,255},
{3,9,255,255,255},
{3,10,255,255,255},
{3,11,255,255,255},
{3,12,0,0,0},
{3,13,0,0,0},
{3,14,255,236,96},
{3,15,255,151,71},
{3,16,255,151,71},
{3,17,255,236,93},
{3,18,0,0,0},
{3,19,255,255,255},
{3,20,255,255,255},
{3,21,255,255,255},
{4,1,255,255,255},
{4,2,255,255,255},
{4,3,255,255,255},
{4,4,255,255,255},
{4,5,255,255,255},
{4,6,255,255,255},
{4,7,255,255,255},
{4,8,255,255,255},
{4,9,255,255,255},
{4,10,255,255,255},
{4,11,0,0,0},
{4,12,0,0,0},
{4,13,255,255,255},
{4,14,255,236,93},
{4,15,255,236,93},
{4,16,255,236,93},
{4,17,255,236,93},
{4,18,0,0,0},
{4,19,255,255,255},
{4,20,255,255,255},
{4,21,255,255,255},
{5,1,255,255,255},
{5,2,255,255,255},
{5,3,255,255,255},
{5,5,255,255,255},
{5,4,255,255,255},
{5,6,255,255,255},
{5,7,255,255,255},
{5,8,255,255,255},
{5,9,255,255,255},
{5,10,0,0,0},
{5,11,255,236,93},
{5,12,255,222,103},
{5,13,0,0,0},
{5,14,0,0,0},
{5,15,255,236,93},
{5,16,255,236,93},
{5,17,255,236,93},
{5,18,0,0,0},
{5,19,255,255,255},
{5,20,255,255,255},
{5,21,255,255,255},
{6,1,255,255,255},
{6,2,255,255,255},
{6,3,255,255,255},
{6,4,255,255,255},
{6,5,255,255,255},
{6,6,255,255,255},
{6,7,255,255,255},
{6,8,0,0,0},
{6,9,0,0,0},
{6,10,255,236,93},
{6,11,255,236,93},
{6,12,255,236,93},
{6,13,255,222,103},
{6,14,255,222,103},
{6,15,29,124,101},
{6,16,29,124,101},
{6,17,29,124,101},
{6,18,0,0,0},
{6,19,255,255,255},
{6,20,255,255,255},
{6,21,255,255,255},
{7,1,255,255,255},
{7,2,255,255,255},
{7,3,255,255,255},
{7,4,255,255,255},
{7,5,255,255,255},
{7,6,255,255,255},
{7,7,0,0,0},
{7,8,0,153,153},
{7,9,0,0,0},
{7,10,255,236,93},
{7,11,255,236,93},
{7,12,255,236,93},
{7,13,255,222,103},
{7,14,255,222,103},
{7,15,255,222,103},
{7,16,29,124,101},
{7,17,29,124,101},
{7,18,0,0,0},
{7,19,255,255,255},
{7,20,255,255,255},
{7,21,255,255,255},
{8,1,255,255,255},
{8,2,255,255,255},
{8,3,255,255,255},
{8,4,255,255,255},
{8,5,255,255,255},
{8,6,0,0,0},
{8,7,0,153,153},
{8,8,255,255,255},
{8,9,0,0,0},
{8,10,255,236,93},
{8,11,255,236,93},
{8,12,255,236,93},
{8,13,255,236,93},
{8,14,255,222,103},
{8,15,29,124,101},
{8,16,29,124,101},
{8,17,29,124,101},
{8,18,0,0,0},
{8,19,255,255,255},
{8,20,255,255,255},
{8,21,255,255,255},
{9,1,255,255,255},
{9,2,255,255,255},
{9,3,255,255,255},
{9,4,255,255,255},
{9,5,255,255,255},
{9,6,0,0,0},
{9,7,255,255,255},
{9,8,255,255,255},
{9,9,0,0,0},
{9,10,255,236,93},
{9,11,255,236,93},
{9,12,255,236,93},
{9,13,255,255,93},
{9,14,255,236,93},
{9,15,255,236,93},
{9,16,0,0,0},
{9,17,0,0,0},
{9,18,0,0,0},
{9,19,0,0,0},
{9,20,0,0,0},
{9,21,255,255,255},
{10,1,255,255,255},
{10,2,255,255,255},
{10,3,255,255,255},
{10,4,255,255,255},
{10,5,255,255,255},
{10,6,255,255,255},
{10,7,0,0,0},
{10,8,255,236,93},
{10,9,255,236,93},
{10,10,255,236,93},
{10,11,255,236,93},
{10,12,255,239,93},
{10,13,255,236,93},
{10,14,255,222,103},
{10,15,0,0,0},
{10,16,255,236,93},
{10,17,255,236,93},
{10,18,255,236,93},
{10,19,255,236,93},
{10,20,0,0,0},
{10,21,255,255,255},
{11,1,255,255,255},
{11,2,255,255,255},
{11,3,255,255,255},
{11,4,255,255,255},
{11,5,255,255,255},
{11,6,0,0,0},
{11,7,0,0,0},
{11,8,255,236,93},
{11,9,255,236,93},
{11,10,255,236,93},
{11,11,255,236,93},
{11,12,255,236,93},
{11,13,255,236,93},
{11,14,0,0,0},
{11,15,255,255,255},
{11,16,255,236,93},
{11,17,151,71,6},
{11,18,151,71,6},
{11,19,152,71,6},
{11,20,255,236,93},
{11,21,0,0,0},
{12,1,255,255,255},
{12,2,255,255,255},
{12,3,255,255,255},
{12,4,255,255,255},
{12,5,0,0,0},
{12,6,255,236,93},
{12,7,0,0,0},
{12,8,255,236,93},
{12,9,255,236,93},
{12,10,255,236,93},
{12,11,255,236,93},
{12,12,255,236,93},
{12,13,255,236,93},
{12,14,0,0,0},
{12,15,0,0,0},
{12,16,255,236,93},
{12,17,151,71,6},
{12,18,151,71,6},
{12,19,151,71,6},
{12,20,255,236,93},
{12,21,0,0,0},
{13,1,255,255,255},
{13,2,255,255,255},
{13,3,0,0,0},
{13,4,0,0,0},
{13,5,255,236,93},
{13,6,0,0,0},
{13,7,255,236,93},
{13,8,255,236,93},
{13,9,255,236,93},
{13,10,255,236,93},
{13,11,255,236,93},
{13,12,255,236,93},
{13,13,255,222,103},
{13,14,0,0,0},
{13,15,255,255,255},
{13,16,0,0,0},
{13,17,255,236,93},
{13,18,255,236,93},
{13,19,255,236,93},
{13,20,255,236,93},
{13,21,0,0,0},
{14,1,255,255,255},
{14,2,0,0,0},
{14,3,0,153,153},
{14,4,255,236,93},
{14,5,0,0,0},
{14,6,255,236,93},
{14,7,255,236,93},
{14,8,0,0,0},
{14,9,255,236,93},
{14,10,255,236,93},
{14,11,255,236,93},
{14,12,255,236,93},
{14,13,255,222,103},
{14,14,255,222,103},
{14,15,0,0,0},
{14,16,255,236,93},
{14,17,255,236,93},
{14,18,255,236,93},
{14,19,255,236,93},
{14,20,0,0,0},
{14,21,255,236,93},
{15,1,0,0,0},
{15,2,0,153,153},
{15,3,0,153,153},
{15,4,255,236,93},
{15,5,0,0,0},
{15,6,255,236,93},
{15,7,255,236,93},
{15,8,0,0,0},
{15,9,255,236,93},
{15,10,255,236,93},
{15,11,0,0,0},
{15,12,0,0,0},
{15,13,255,222,103},
{15,14,255,222,103},
{15,15,255,222,103},
{15,16,0,0,0},
{15,17,0,0,0},
{15,18,0,0,0},
{15,19,0,0,0},
{15,20,0,0,0},
{15,21,255,255,255},
{16,1,0,0,0},
{16,2,0,0,0},
{16,3,0,0,0},
{16,4,0,153,153},
{16,5,255,236,93},
{16,6,255,236,93},
{16,7,255,236,93},
{16,8,255,222,103},
{16,9,0,0,0},
{16,10,0,0,0},
{16,11,255,255,255},
{16,12,0,111,108},
{16,13,0,0,0},
{16,14,255,235,93},
{16,15,24,124,101},
{16,16,24,124,101},
{16,17,24,124,101},
{16,18,24,124,101},
{16,19,24,124,101},
{16,20,0,0,0},
{16,21,255,255,255},
{17,1,255,255,255},
{17,2,255,255,255},
{17,3,0,0,0},
{17,4,0,153,153},
{17,5,255,236,93},
{17,6,255,236,93},
{17,7,255,236,93},
{17,8,255,236,93},
{17,9,0,0,0},
{17,10,255,255,255},
{17,11,0,111,108},
{17,12,0,111,108},
{17,13,29,124,101},
{17,14,0,0,0},
{17,15,29,124,101},
{17,16,29,124,101},
{17,17,29,124,101},
{17,18,29,124,101},
{17,19,0,0,0},
{17,20,255,255,255},
{17,21,255,255,255},
{18,1,255,255,255},
{18,2,255,255,255},
{18,3,0,0,0},
{18,4,0,153,153},
{18,5,255,236,93},
{18,6,0,0,0},
{18,7,255,222,103},
{18,8,255,222,103},
{18,9,0,0,0},
{18,10,0,153,153},
{18,11,0,153,153},
{18,12,0,153,153},
{18,13,0,153,153},
{18,14,29,124,101},
{18,15,29,124,101},
{18,16,29,124,101},
{18,17,29,124,101},
{18,18,29,124,101},
{18,19,0,0,0},
{18,20,255,255,255},
{18,21,255,255,255},
{19,1,255,255,255},
{19,2,255,255,255},
{19,3,255,255,255},
{19,4,0,0,0},
{19,5,0,111,108},
{19,6,0,0,0},
{19,7,255,236,93},
{19,8,255,236,93},
{19,9,0,111,108},
{19,10,0,0,0},
{19,11,0,111,108},
{19,12,0,111,108},
{19,13,29,124,101},
{19,14,29,124,101},
{19,15,29,124,101},
{19,16,29,124,101},
{19,17,29,124,101},
{19,18,0,0,0},
{19,19,255,255,255},
{19,20,255,255,255},
{19,21,255,255,255},
{20,1,255,255,255},
{20,2,255,255,255},
{20,3,255,255,255},
{20,4,0,0,0},
{20,5,0,111,108},
{20,6,255,236,93},
{20,7,255,236,93},
{20,8,0,111,108},
{20,9,0,111,108},
{20,10,0,111,108},
{20,11,0,111,108},
{20,12,0,111,108},
{20,13,29,124,101},
{20,14,29,124,101},
{20,15,29,124,101},
{20,16,29,124,101},
{20,17,0,0,0},
{20,18,0,0,0},
{20,19,255,255,255},
{20,20,255,255,255},
{20,21,255,255,255},
{21,1,255,255,255},
{21,2,255,255,255},
{21,3,255,255,255},
{21,4,0,0,0},
{21,5,0,153,153},
{21,6,29,124,103},
{21,7,29,124,103},
{21,8,29,124,103},
{21,9,29,124,103},
{21,10,29,124,107},
{21,11,0,0,0},
{21,12,0,0,0},
{21,13,0,0,0},
{21,14,0,0,0},
{21,15,0,0,0},
{21,16,255,255,255},
{21,17,255,255,255},
{21,18,255,255,255},
{21,19,255,255,255},
{21,20,255,255,255},
{21,21,255,255,255},
{22,1,255,255,255},
{22,2,255,255,255},
{22,3,0,0,0},
{22,4,0,153,153},
{22,5,0,111,108},
{22,6,0,111,108},
{22,7,0,111,108},
{22,8,0,111,108},
{22,9,0,0,0},
{22,10,255,255,255},
{22,11,255,255,255},
{22,12,255,255,255},
{22,13,255,255,255},
{22,14,255,255,255},
{22,15,255,255,255},
{22,16,255,255,255},
{22,17,255,255,255},
{22,18,255,255,255},
{22,19,255,255,255},
{22,20,255,255,255},
{22,21,255,255,255},
{23,1,255,255,255},
{23,2,255,255,255},
{23,3,0,0,0},
{23,4,0,153,153},
{23,5,0,111,108},
{23,6,0,111,108},
{23,7,0,0,0},
{23,8,0,0,0},
{23,9,0,0,0},
{23,10,0,0,0},
{23,11,255,255,255},
{23,12,255,255,255},
{23,13,255,255,255},
{23,14,255,255,255},
{23,15,255,255,255},
{23,16,255,255,255},
{23,17,255,255,255},
{23,18,255,255,255},
{23,19,255,255,255},
{23,20,255,255,255},
{23,21,255,255,255},
{24,1,255,255,255},
{24,2,255,255,255},
{24,3,255,255,255},
{24,4,0,0,0},
{24,5,0,0,0},
{24,6,0,0,0},
{24,7,255,255,255},
{24,8,255,255,255},
{24,9,255,255,255},
{24,10,255,255,255},
{24,11,255,255,255},
{24,12,255,255,255},
{24,13,255,255,255},
{24,14,255,255,255},
{24,15,255,255,255},
{24,16,255,255,255},
{24,17,255,255,255},
{24,18,255,255,255},
{24,19,255,255,255},
{24,20,255,255,255},
{24,21,255,255,255},    
      };
      
int [][]  inicio ={
{8,16,0,0,0},
{8,17,0,0,0},
{8,18,0,0,0},
{8,19,0,0,0},
{8,20,0,0,0},
{8,21,0,0,0},
{8,22,0,0,0},
{8,23,0,0,0},
{8,24,0,0,0},
{8,25,0,0,0},
{8,26,0,0,0},
{8,27,0,0,0},
{8,28,0,0,0},
{8,29,0,0,0},
{8,30,0,0,0},
{11,18,0,0,0},
{11,19,0,0,0},
{11,20,0,0,0},
{11,21,0,0,0},
{11,22,0,0,0},
{11,23,0,0,0},
{11,24,0,0,0},
{11,25,0,0,0},
{11,26,0,0,0},
{11,27,0,0,0},
{11,28,0,0,0},
{11,29,0,0,0},
{11,30,0,0,0},
{12,19,0,0,0},
{13,18,0,0,0},
{14,18,0,0,0},
{15,18,0,0,0},
{16,18,0,0,0},
{17,19,0,0,0},
{18,20,0,0,0},
{18,21,0,0,0},
{18,22,0,0,0},
{18,23,0,0,0},
{18,24,0,0,0},
{18,25,0,0,0},
{18,26,0,0,0},
{18,27,0,0,0},
{18,28,0,0,0},
{18,29,0,0,0},
{18,30,0,0,0},
{21,17,0,0,0},
{21,19,0,0,0},
{21,20,0,0,0},
{21,21,0,0,0},
{21,22,0,0,0},
{21,23,0,0,0},
{21,24,0,0,0},
{21,25,0,0,0},
{21,26,0,0,0},
{21,27,0,0,0},
{21,28,0,0,0},
{21,29,0,0,0},
{21,30,0,0,0},
{25,20,0,0,0},
{25,21,0,0,0},
{25,22,0,0,0},
{25,23,0,0,0},
{25,24,0,0,0},
{25,25,0,0,0},
{25,26,0,0,0},
{25,27,0,0,0},
{25,28,0,0,0},
{25,29,0,0,0},
{26,18,0,0,0},
{27,18,0,0,0},
{28,18,0,0,0},
{29,18,0,0,0},
{30,18,0,0,0},
{31,18,0,0,0},
{32,30,0,0,0},
{26,30,0,0,0},
{27,30,0,0,0},
{28,30,0,0,0},
{29,30,0,0,0},
{30,30,0,0,0},
{31,30,0,0,0},
{32,30,0,0,0},
{36,17,0,0,0},
{36,19,0,0,0},
{36,20,0,0,0},
{36,21,0,0,0},
{36,22,0,0,0},
{36,23,0,0,0},
{36,24,0,0,0},
{36,25,0,0,0},
{36,26,0,0,0},
{36,27,0,0,0},
{36,28,0,0,0},
{36,29,0,0,0},
{36,30,0,0,0},
{40,20,0,0,0},
{40,21,0,0,0},
{40,22,0,0,0},
{40,23,0,0,0},
{40,24,0,0,0},
{40,25,0,0,0},
{40,26,0,0,0},
{40,27,0,0,0},
{40,28,0,0,0},
{40,29,0,0,0},
{41,19,0,0,0},
{42,19,0,0,0},
{43,19,0,0,0},
{44,19,0,0,0},
{45,19,0,0,0},
{41,30,0,0,0},
{42,30,0,0,0},
{43,30,0,0,0},
{44,30,0,0,0},
{45,30,0,0,0},
{46,20,0,0,0},
{46,21,0,0,0},
{46,22,0,0,0},
{46,23,0,0,0},
{46,24,0,0,0},
{46,25,0,0,0},
{46,26,0,0,0},
{46,27,0,0,0},
{46,28,0,0,0},
{46,29,0,0,0},
{7,16,0,0,0},
{7,17,0,0,0},
{7,18,0,0,0},
{7,19,0,0,0},
{7,20,0,0,0},
{7,21,0,0,0},
{7,22,0,0,0},
{7,23,0,0,0},
{7,24,0,0,0},
{7,25,0,0,0},
{7,26,0,0,0},
{7,27,0,0,0},
{7,28,0,0,0},
{7,29,0,0,0},
{7,30,0,0,0},
{11,17,0,0,0},
{12,17,0,0,0},
{12,18,0,0,0},
{12,20,0,0,0},
{12,21,0,0,0},
{12,22,0,0,0},
{12,23,0,0,0},
{12,24,0,0,0},
{12,25,0,0,0},
{12,26,0,0,0},
{12,27,0,0,0},
{12,28,0,0,0},
{12,29,0,0,0},
{12,30,0,0,0},
{13,19,0,0,0},
{14,19,0,0,0},
{15,19,0,0,0},
{16,19,0,0,0},
{17,18,0,0,0},
{17,20,0,0,0},
{17,21,0,0,0},
{17,22,0,0,0},
{17,23,0,0,0},
{17,24,0,0,0},
{17,25,0,0,0},
{17,26,0,0,0},
{17,27,0,0,0},
{17,28,0,0,0},
{17,29,0,0,0},
{17,30,0,0,0},
{18,18,0,0,0},
{18,19,0,0,0},
{21,16,0,0,0},
{22,16,0,0,0},
{22,17,0,0,0},
{22,19,0,0,0},
{22,20,0,0,0},
{22,21,0,0,0},
{22,22,0,0,0},
{22,23,0,0,0},
{22,24,0,0,0},
{22,25,0,0,0},
{22,26,0,0,0},
{22,27,0,0,0},
{22,28,0,0,0},
{22,29,0,0,0},
{22,30,0,0,0},
{25,19,0,0,0},
{25,30,0,0,0},
{26,20,0,0,0},
{26,21,0,0,0},
{26,22,0,0,0},
{26,23,0,0,0},
{26,24,0,0,0},
{26,25,0,0,0},
{26,26,0,0,0},
{26,27,0,0,0},
{27,20,0,0,0},
{28,20,0,0,0},
{29,20,0,0,0},
{30,20,0,0,0},
{31,20,0,0,0},
{32,20,0,0,0},
{27,29,0,0,0},
{28,29,0,0,0},
{29,29,0,0,0},
{30,29,0,0,0},
{31,29,0,0,0},
{32,29,0,0,0},
{36,15,0,0,0},
{37,16,0,0,0},
{37,17,0,0,0},
{37,19,0,0,0},
{37,20,0,0,0},
{37,21,0,0,0},
{37,22,0,0,0},
{37,23,0,0,0},
{37,24,0,0,0},
{37,25,0,0,0},
{37,26,0,0,0},
{37,27,0,0,0},
{37,28,0,0,0},
{37,29,0,0,0},
{37,30,0,0,0},
{41,20,0,0,0},
{41,21,0,0,0},
{41,22,0,0,0},
{41,23,0,0,0},
{41,24,0,0,0},
{41,25,0,0,0},
{41,26,0,0,0},
{41,27,0,0,0},
{41,28,0,0,0},
{41,29,0,0,0},
{42,20,0,0,0},
{43,20,0,0,0},
{44,20,0,0,0},
{42,29,0,0,0},
{43,29,0,0,0},
{44,29,0,0,0},
{45,20,0,0,0},
{45,21,0,0,0},
{45,22,0,0,0},
{45,23,0,0,0},
{45,24,0,0,0},
{45,25,0,0,0},
{45,26,0,0,0},
{45,27,0,0,0},
{45,28,0,0,0},
{45,29,0,0,0},

};

int [][] Fin = {
    {1,1,0,0,0},
{1,2,0,0,0},
{1,3,0,0,0},
{1,4,0,0,0},
{1,5,0,0,0},
{1,6,0,0,0},
{1,7,0,0,0},
{1,8,0,0,0},
{1,9,0,0,0},
{1,10,0,0,0},
{1,11,0,0,0},
{1,12,0,0,0},
{1,13,0,0,0},
{1,14,0,0,0},
{1,15,0,0,0},
{1,16,0,0,0},
{2,1,0,0,0},
{2,2,0,0,0},
{2,3,0,0,0},
{2,4,0,0,0},
{2,5,0,0,0},
{2,6,0,0,0},
{2,7,0,0,0},
{2,8,0,0,0},
{2,9,0,0,0},
{2,10,0,0,0},
{2,11,0,0,0},
{2,12,0,0,0},
{2,13,0,0,0},
{2,14,0,0,0},
{2,15,0,0,0},
{2,16,0,0,0},
{3,1,0,0,0},
{3,2,0,0,0},
{3,8,0,0,0},
{3,9,0,0,0},
{4,1,0,0,0},
{4,2,0,0,0},
{4,8,0,0,0},
{4,9,0,0,0},
{5,1,0,0,0},
{5,2,0,0,0},
{6,1,0,0,0},
{6,2,0,0,0},
{8,2,0,0,0},
{8,3,0,0,0},
{8,5,0,0,0},
{8,6,0,0,0},
{8,7,0,0,0},
{8,8,0,0,0},
{8,9,0,0,0},
{8,10,0,0,0},
{8,11,0,0,0},
{8,12,0,0,0},
{8,13,0,0,0},
{8,14,0,0,0},
{8,15,0,0,0},
{8,16,0,0,0},
{9,2,0,0,0},
{9,3,0,0,0},
{9,5,0,0,0},
{9,6,0,0,0},
{9,7,0,0,0},
{9,8,0,0,0},
{9,9,0,0,0},
{9,10,0,0,0},
{9,11,0,0,0},
{9,12,0,0,0},
{9,13,0,0,0},
{9,14,0,0,0},
{9,15,0,0,0},
{9,16,0,0,0},
{12,5,0,0,0},
{12,6,0,0,0},
{12,7,0,0,0},
{12,8,0,0,0},
{12,9,0,0,0},
{12,10,0,0,0},
{12,11,0,0,0},
{12,12,0,0,0},
{12,13,0,0,0},
{12,14,0,0,0},
{12,15,0,0,0},
{12,16,0,0,0},
{13,5,0,0,0},
{13,6,0,0,0},
{13,7,0,0,0},
{13,8,0,0,0},
{13,9,0,0,0},
{13,10,0,0,0},
{13,11,0,0,0},
{13,12,0,0,0},
{13,13,0,0,0},
{13,14,0,0,0},
{13,15,0,0,0},
{13,16,0,0,0},
{14,6,0,0,0},
{14,7,0,0,0},
{15,6,0,0,0},
{15,7,0,0,0},
{16,6,0,0,0},
{16,7,0,0,0},
{17,5,0,0,0},
{17,6,0,0,0},
{17,7,0,0,0},
{17,8,0,0,0},
{17,9,0,0,0},
{17,10,0,0,0},
{17,11,0,0,0},
{17,12,0,0,0},
{17,13,0,0,0},
{17,14,0,0,0},
{17,15,0,0,0},
{17,16,0,0,0},
{18,5,0,0,0},
{18,6,0,0,0},
{18,7,0,0,0},
{18,8,0,0,0},
{18,9,0,0,0},
{18,10,0,0,0},
{18,11,0,0,0},
{18,12,0,0,0},
{18,13,0,0,0},
{18,14,0,0,0},
{18,15,0,0,0},
{18,16,0,0,0},

    
};

    public ProyectoFinal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lienzo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lienzo.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jButton1.setText("dibujo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("arriba");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("der");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("abajo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("↘");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setText("izq");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton7.setText("↙");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("↖");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("↗");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton8)
                            .addComponent(jButton9))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton7)
                            .addComponent(jButton6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //funciones:
        rectanguloContorno();
        rectanguloDentro();
        circuloMonedas1();
        circuloMonedas2();
        circuloMonedas3();
        
        Punto punto;
            
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,240,240,240);
          punto.dibujo(g);
        
     
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
      
      
      for (int i = 0;i<inicio.length;i++){
          x = inicio [i][0] + 15 ;
          y = inicio [i][1] + 45 ;
          r = inicio [i][2];
          v = inicio [i][3];
          a = inicio [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
      
       for (int i = 0;i<Fin.length;i++){
          x = Fin [i][0] + 780 ;
          y = Fin [i][1] + 500;
          r = Fin [i][2];
          v = Fin [i][3];
          a = Fin [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
       }
          
      
    }//GEN-LAST:event_jButton1ActionPerformed

      
    
    private void rectanguloContorno(){
        Graphics g= Lienzo.getGraphics();
        int x = 0;  
        int y=0 ;
        int ancho = 549;
        int alto=849;
        int Rojo=183;
        int Verde=222;
        int Azul=232;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x =40; 
         y= 35 ;
         ancho = 20 ;
         alto=760;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x = 40; 
         y= 85 ;
         ancho = 450 ;
         alto=20;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x = 40; 
         y= 520;
         ancho = 20 ;
         alto=760;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x = 780; 
         y= 40;
         ancho = 450 ;
         alto=20;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
                }
     
    private void rectanguloDentro(){
        
        Graphics g= Lienzo.getGraphics();
        int x = 61; 
        int y=130 ;
        int ancho = 30;
        int alto=80;
        int Rojo=255;
        int Verde=0;
        int Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        
        x = 61; 
        y=265 ;
        ancho = 30;
        alto=110;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 105; 
        y=330 ;
        ancho = 190;
        alto=30;
        Rojo=146;
        Verde=208;
        Azul=80;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 205; 
        y= 55;
        ancho = 120;
        alto=30;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 180; 
        y= 210;
        ancho = 23;
        alto=100;
        Rojo=79;
        Verde=129;
        Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
    
        x = 225; 
        y= 233;
        alto =30;
        ancho = 120;
         Rojo=146;
        Verde=208;
        Azul=80;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x = 200; 
        y= 400;
        ancho = 90;
        alto=30;
        Rojo=79;
        Verde=129;
        Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 281; 
        y= 55;
        ancho = 190;
        alto=30;
        Rojo=255;
        Verde=0;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 385; 
        y= 130;
        ancho = 30;
        alto=65;
        Rojo=79;
        Verde=129;
        Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        
         x = 355; 
        y=130 ;
        ancho = 115;
        alto=30;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 295; 
        y= 280;
        ancho = 30;
        alto=155;
        Rojo=79;
        Verde=129;
        Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 295; 
        y= 310;
        ancho = 115;
        alto=30;
        Rojo=255;
        Verde=0;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 231; 
        y=465 ;
        ancho = 25;
        alto=410;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 445; 
        y= 130;
        ancho = 335;
        alto=30;
        Rojo=146;
        Verde=208;
        Azul=80;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 365; 
        y= 345;
        ancho = 120;
        alto=30;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 365; 
        y= 345;
        ancho = 120;
        alto=30;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        
        x = 515; 
        y= 55;
        ancho = 210;
        alto=30;
        Rojo=255;
        Verde=5;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 475; 
        y= 345;
        ancho = 30;
        alto=150;
        Rojo=255;
        Verde=5;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 535; 
        y= 410;
        ancho = 55;
        alto=30;
        Rojo=255;
        Verde=5;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x = 640; 
        y= 465;
        ancho = 55;
        alto=30;
        Rojo=146;
        Verde=208;
        Azul=80;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 590; 
        y= 88;
        ancho = 202;
        alto=30;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 675; 
        y= 55;
        ancho = 235;
        alto=30;
        Rojo=255;
        Verde=255;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        x = 621; 
        y= 255;
        ancho = 35;
        alto=85;
        Rojo=146;
        Verde=208;
        Azul=80;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x =605; 
         y= 410 ;
         ancho = 23 ;
         alto=130;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         
        x = 705; 
        y= 433;
        ancho = 87;
        alto=30;
        Rojo=255;
        Verde=5;
        Azul=0;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
         x =670; 
         y= 340 ;
         ancho = 33 ;
         alto=120;
         Rojo=79;
         Verde=129;
         Azul=189;
        rec = new Rectangulo (x,y,ancho,alto);
        rec.Cambiacolor(Rojo, Verde, Azul);
        rec.dibujaRelleno(g);
        
        
        
        
        
    }
    
    private void circuloMonedas1 (){
        
         Graphics g =Lienzo.getGraphics(); 
        int x =80;
        int y = 70;
        int radio = 7;
        int rojo = 255;
        int verde = 215;
        int azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x =110;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =140;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =170;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =110;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =140;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =170;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =170;
        y = 160;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =170;
        y = 130;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          
        x =170;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =140;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =110;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =80;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =110;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =140;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =170;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =200;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =230;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =260;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =260;
        y = 160;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =260;
        y = 130;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =260;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        
        x =80;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =110;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =140;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =170;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =200;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x =200;
        y = 280;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
       
          x =200;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         
          x =170;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         
          x =140;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
            x =140;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =110;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 310;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 340;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 370;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 400;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =80;
        y = 430;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        

    
        x =80;
        y = 460;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
       
        x =80;
        y = 490;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        x =200;
        y = 340;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =200;
        y = 370;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
         x =170;
        y = 340;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
       
          x =170;
        y = 370;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x =170;
        y = 400;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x =170;
        y = 430;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =170;
        y = 460;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =170;
        y = 490;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =200;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =230;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =230;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x =260;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        x =290;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =320;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =350;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =380;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =410;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =440;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =470;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =500;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
                
          
         x =530;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =560;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =590;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x =620;
        y = 505;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c= new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
       
       
       
    }
    
    private void circuloMonedas2 (){
        
         Graphics g =Lienzo.getGraphics();
        int x = 230;
        int y = 370;
        int radio = 7;
        int rojo = 255;
        int verde = 215;
        int azul = 0;
        Circulo c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 260;
        y = 370;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 260;
        y = 400;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        
        x = 260;
        y = 400;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 260;
        y = 430;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 285;
        y = 445;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 315;
        y = 445;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 345;
        y = 445;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
        
         x = 345;
        y = 415;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 345;
        y = 385;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 345;
        y = 355;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 345;
        y = 325;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 375;
        y = 325;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 405;
        y = 325;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 435;
        y = 325;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
         x = 425;
        y = 355;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 425;
        y = 385;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 425;
        y = 415;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 425;
        y = 445;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
         x = 275;
        y = 340;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
           x = 275;
        y = 310;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
           x = 275;
        y = 280;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 290;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 315;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 345;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 375;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 405;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 435;
        y = 262;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 230;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 200;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 170;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 140;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 330;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 360;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 360;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 390;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 390;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 420;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 420;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 450;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 450;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 480;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 480;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 505;
        y = 80;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 505;
        y = 110;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 140;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 170;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 210;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 240;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 270;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 300;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 495;
        y = 330;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
      
        
        x = 490;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 490;
        y = 420;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 490;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 520;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 520;
        y = 420;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 520;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 550;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 580;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 610;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 580;
        y = 410;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 580;
        y = 430;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
            x = 580;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 600;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 620;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 640;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 660;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 680;
        y = 450;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 685;
        y = 480;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 685;
        y = 510;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 640;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 670;
        y = 390;
        radio = 7;
        rojo = 255;
        verde =215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
    } 
    
    private void circuloMonedas3 (){
         Graphics g =Lienzo.getGraphics();
        int x = 530;
        int y = 300;
        int radio = 7;
        int rojo = 255;
        int verde = 215;
        int azul = 0;
        Circulo c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 560;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 590;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
        
         x = 620;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
        
         x = 650;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        
        x = 680;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 710;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
         x = 740;
        y = 300;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 740;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
        x = 710;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);    x = 740;
        
        
        x = 680;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
          x = 650;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
          x = 620;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
            x = 590;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
              x = 560;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
              x = 530;
        y = 330;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        x = 570;
        y = 260;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 570;
        y = 230;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 570;
        y = 200;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
        x = 570;
        y = 170;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 570;
        y = 140;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 570;
        y = 110;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 570;
        y = 80;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
      
        
         x = 600;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 630;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 660;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
          x = 650;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 650;
        y = 130;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
       x = 650;
        y = 160;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 650;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 650;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 220;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 190;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 160;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 160;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 130;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 130;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 100;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 70;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 730;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 250;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 730;
        y = 275;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 275;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 730;
        y = 390;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        x = 760;
        y = 390;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
           x = 700;
        y = 390;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 760;
        y = 420;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 760;
        y = 450;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
        
         x = 760;
        y = 480;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
         x = 760;
        y = 510;
        radio = 7;
        rojo = 255;
        verde = 215;
        azul = 0;
        c =new Circulo (x,y,radio);
        c.Cambiacolor(rojo, verde, azul);
        c.RellenarCirculo(g);
        
    }
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
       
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++) {
           imagen [i][1] = imagen [i][1]  -=5;
       
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
        
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][1] = imagen [i][1] +=5 ;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
        
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] -=5 ;
           

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
       
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] +=5;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
;        int a = 0;
       
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] -=5;
           imagen [i][1] = imagen [i][1] -=5;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
      
        
        for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] -=5 ;
           imagen [i][1] = imagen [i][1] +=5;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
    
        
          for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] +=5;
           imagen [i][1] = imagen [i][1] -=5;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
        
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Punto punto;
        Graphics g = Lienzo.getGraphics();
        int x = 0;
        int y = 0;
        int r = 0;
        int v = 0;
        int a = 0;
       
        
          for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          punto = new Punto(x,y,183,222,232);
          punto.dibujo(g);
        }
        
      for (int i = 0;i<imagen.length;i++){
           imagen [i][0] = imagen [i][0] +=5;
           imagen [i][1] = imagen [i][1] +=5;

         
      }
      for (int i = 0;i<imagen.length;i++){
          x = imagen [i][0];
          y = imagen [i][1];
          r = imagen [i][2];
          v = imagen [i][3];
          a = imagen [i][4];
          punto = new Punto(x,y,r,v,a);
          punto.dibujo(g);
      }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lienzo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
