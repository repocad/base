/*
 * Copyright (c) 2012. Siigna is released under the creative common license by-nc-sa. You are free
 * to Share — to copy, distribute and transmit the work,
 * to Remix — to adapt the work
 *
 * Under the following conditions:
 * Attribution —  You must attribute the work to http://siigna.com in the manner specified by the author or licensor (but not in any way that suggests that they endorse you or your use of the work).
 * Noncommercial — You may not use this work for commercial purposes.
 * Share Alike — If you alter, transform, or build upon this work, you may distribute the resulting work only under the same or similar license to this one.
 */

package com.siigna.module.base.radialmenu

import com.siigna._
import java.awt.Color

/**
 * Contains a number of icons represented as an array of [[com.siigna.app.model.shape.Shape]]s that can be
 * used to draw
 */
object MenuIcons {

  private def T(s : Shape*) : Traversable[Shape] = s
  private val A = com.siigna.ArcShape
  private val Q = com.siigna.CircleShape
  private val L = com.siigna.LineShape
  private val V = com.siigna.Vector2D

  // Colors
  val createColor     = new Color(0.85f, 0.85f, 0.25f, 0.30f)
  val fileColor       = new Color(0.40f, 0.40f, 0.40f, 0.15f)
  val eventColor      = new Color(0.95f, 0.95f, 0.95f, 0.80f)
  val helpersColor    = new Color(0.65f, 0.80f, 0.25f, 0.30f)
  val itemColor       = new Color(0.95f, 0.95f, 0.95f, 0.55f)
  val highlightIcon   = new Color(1.00f, 1.00f, 1.00f, 1.00f)
  val modifyColor     = new Color(0.55f, 0.65f, 0.80f, 0.30f)
  val propertiesColor = new Color(0.80f, 0.45f, 0.65f, 0.18f)

  // Category-shapes
  val C, E, N, W, S = T(Q(V(0, 0), V(0, 26)))

  val ENE = T(A(V(-24,3.7),V(-16,-8.9),V(-8.8,-23)),A(V(-8.8,-23),V(-6.2,-25),V(-2.5,-25)),A(V(-23.4,10.6),V(-25,7.3),V(-24,3.7)),A(V(-3.1,27),V(0.51,28),V(3.8,26)),A(V(3.8,26),V(15.5,9.1),V(25,-9.8)),A(V(25,-9.8),V(24.7,-13.6),V(22,-16)),L(V(-3.1,27),V(-23.4,10.6)),L(V(22,-16),V(-2.5,-25)))
  val NNE = T(A(V(-22,-9.1),V(-8.9,-16),V(3.5,-24)),A(V(10,-23),V(7.1,-25),V(3.5,-24)),A(V(-25,-2.9),V(-24.9,-6.6),V(-22,-9.1)),A(V(-9.7,24.4),V(8.9,16),V(26,4.3)),A(V(-16,22),V(-13.5,24.3),V(-9.7,24.4)),A(V(26,4.3),V(28,1),V(27,-2.7)),L(V(10,-23),V(27,-2.7)),L(V(-25,-2.9),V(-16,22)))
  val NNW = T(A(V(-3.6,-24),V(8.8,-16),V(22,-9.2)),A(V(-3.6,-24),V(-7.2,-25),V(-10,-23)),A(V(-26,4.2),V(-8.9,16),V(9.6,24)),A(V(9.6,24),V(13,24),V(16,21)),A(V(25,-3),V(25,-6.7),V(22,-9.2)),A(V(-27,-2.9),V(-28.86,1),V(-26,4.2)),L(V(-10,-23),V(-27,-2.9)),L(V(25,-3),V(16,21)))
  val WNW = T(A(V(8.8,-22),V(16,-8.7),V(24,3.8)),A(V(8.8,-22),V(6.2,-25),V(2.5,-25)),A(V(23,11),V(25,7.5),V(24,3.8)),A(V(-3.8,26),V(-16,9.1),V(-25,-9.6)),A(V(-3.8,26),V(-0.46,28),V(3.2,27)),A(V(-25,-9.6),V(-25,-13),V(-22,-16)),L(V(-22,-16),V(2.5,-25)),L(V(23,11),V(3.2,27)))
  val WSW = T(A(V(23.5,-10.7),V(25,-7.1),V(24,-3.4)),A(V(2.4,25),V(6.1,25),V(8.7,23)),A(V(8.7,23),V(16,9.1),V(24,-3.4)),A(V(-3.9,-26),V(-16,-8.7),V(-25,10)),A(V(-3.9,-26),V(-0.59,-28),V(3.1,-27)),A(V(-22,16),V(-25,14),V(-25,10)),L(V(23.5,-10.7),V(3.1,-27)),L(V(-22,16),V(2.4,25)))
  val SSW = T(A(V(22,9.3),V(8.8,16),V(-3.6,24)),A(V(-10,23),V(-7.1,25),V(-3.6,24)),A(V(22,9.3),V(25,6.7),V(25,3)),A(V(-26,-4.2),V(-8.9,-16),V(9.7,-24)),A(V(-26,-4.2),V(-28,-0.82),V(-27,2.9)),A(V(9.7,-24),V(14,-24),V(16,-21)),L(V(-10,23),V(-27,2.9)),L(V(16,-21),V(25,3)))
  val SSE = T(A(V(3.5,24),V(-8.9,16),V(-22,9.2)),A(V(3.5,24),V(7,25),V(10,23)),A(V(-25,2.9),V(-25,6.6),V(-22,9.2)),A(V(-9.8,-24),V(8.8,-16),V(26,-4.3)),A(V(-16,-22),V(-14,-24),V(-9.8,-24)),A(V(26,-4.3),V(28,-0.93),V(27,2.8)),L(V(10,23),V(27,2.8)),L(V(-25,2.9),V(-16,-22)))
  val ESE = T(A(V(-8.7,23),V(-15,9.1),V(-24,-3.5)),A(V(-8.7,23),V(-6.1,25),V(-2.4,25)),A(V(-23,-10),V(-25,-7.1),V(-24,-3.5)),A(V(4,-26),V(15.7,-8.7),V(25,10)),A(V(-3,-27),V(0.63,-28),V(4,-26)),A(V(22,16),V(25,14),V(25,10)),L(V(-23,-10),V(-3,-27)),L(V(22,16),V(-2.4,25)))

  // Outlines
  val NOutline = T(A(V(21,150),V(0,158),V(-21,150)),A(V(-21,150),V(-63.8,137),V(-101,112)),A(V(21,150),V(63.8,137),V(101,112)),A(V(-17.7,107),V(0,100),V(17.7,107)),A(V(-17.7,107),V(-46.9,97.3),V(-72.3,80.3)),A(V(17.7,107),V(46.9,97.3),V(72.3,80.3)),L(V(-72.3,80.3),V(-101,112)),L(V(72.3,80.3),V(101,112)))
  val EOutline = T(A(V(112,101),V(137,63.8),V(150,21)),A(V(150,-21),V(158,0),V(150,21)),A(V(150,-21),V(137,-63.8),V(112,-101)),A(V(80.3,72.3),V(97.3,46.9),V(107,17.7)),A(V(107,-17.7),V(100,0),V(107,17.7)),A(V(107,-17.7),V(97.3,-46.9),V(80.3,-72.3)),L(V(112,101),V(80.3,72.3)),L(V(80.3,-72.3),V(112,-101)))
  val WOutline = T(A(V(-112,101),V(-137,63.8),V(-150,21)),A(V(-150,-21),V(-158,0),V(-150,21)),A(V(-150,-21),V(-137,-63.8),V(-112,-101)),A(V(-80.3,72.3),V(-97.3,46.9),V(-107,17.7)),A(V(-107,-17.7),V(-100,0),V(-107,17.7)),A(V(-107,-17.7),V(-97.3,-46.9),V(-80.3,-72.3)),L(V(-112,101),V(-80.3,72.3)),L(V(-80.3,-72.3),V(-112,-101)))
  val SOutline = T(A(V(21,-150),V(0,-158),V(-21,-150)),A(V(-21,-150),V(-63.8,-137),V(-101.8,-111.8)),A(V(21,-150),V(63.8,-137),V(101.8,-111.8)),A(V(-17.7,-107),V(0,-100),V(17.7,-107)),A(V(-17.7,-107),V(-46.9,-97.3),V(-73,-80)),A(V(17.7,-107),V(46.9,-97.3),V(73,-80)),L(V(-73,-80),V(-101.8,-111.8)),L(V(73,-80),V(101.8,-111.8)))

  // Arrows
  val NNWArrow = T(A(V(-1.23,6.13),V(5.94,9.76),V(13.3,13)),L(V(13.3,13),V(17.7,1.9)),A(V(17.7,1.9),V(11,-1.02),V(4.47,-4.33)),L(V(4.47,-4.33),V(7.89,-10.6)),L(V(7.89,-10.6),V(-14.6,-9.63)),L(V(-14.6,-9.63),V(-4.56,12.2)),L(V(-4.56,12.2),V(-1.23,6.13)))
  val NNEArrow = T(A(V(-4.47,-4.33),V(-11,-1.02),V(-17.7,1.9)),L(V(-17.7,1.9),V(-13.3,13)),A(V(-13.3,13),V(-5.94,9.76),V(1.23,6.13)),L(V(1.23,6.13),V(4.56,12.2)),L(V(4.56,12.2),V(14.6,-9.63)),L(V(14.6,-9.63),V(-7.89,-10.6)),L(V(-7.89,-10.6),V(-4.47,-4.33)))

  //CREATE
  val angularDimension = T(L(V(-2.45,-7.13),V(-13.5,-11.1)),L(V(13,5.09),V(4.6,12.4)),L(V(-2.55,-10.2),V(-13.5,-8.3)),L(V(10.1,3.56),V(8.08,13.5)),A(V(13.5,8.94),V(-2.29,2.29),V(-8.62,-13.6)))
  val arc              = T(A(V(10.8,11.5),V(-4.95,4.9),V(-11.3,-11)),L(V(12.1,12.8),V(12.1,10.3)),L(V(12.1,10.3),V(9.66,10.3)),L(V(9.66,10.3),V(9.66,12.8)),L(V(12.1,12.8),V(9.66,12.8)),L(V(-6.13,6.18),V(-3.66,6.18)),L(V(-3.66,6.18),V(-3.66,3.7)),L(V(-6.13,3.7),V(-3.66,3.7)),L(V(-6.13,3.7),V(-6.13,6.18)),L(V(-9.98,-9.75),V(-9.98,-12.2)),L(V(-9.98,-12.2),V(-12.5,-12.2)),L(V(-12.5,-12.2),V(-12.5,-9.75)),L(V(-9.98,-9.75),V(-12.5,-9.75)))
  val artline          = T(L(V(-9.6534,-2.2304),V(-7.5072,6.0366)),L(V(1.4752,-6.9998),V(-7.5867,-8.7485)),L(V(-9.4818,-6.1796),V(-7.5867,-8.7485)),L(V(-9.4945,-8.1126),V(-5.7217,-8.3886)),L(V(-8.5343,-7.4641),V(-9.6534,-2.2304)),L(V(-5.7217,-8.3886),V(-8.779,-9.7819)),L(V(9.3447,-8.828),V(0.33118,-7.2205)),L(V(-9.4945,-8.1126),V(-9.4509,-1.4503)),L(V(-9.4818,-6.1796),V(-8.779,-9.7819)),L(V(-7.5867,-8.7485),V(-9.5575,-8.6348)))
  val circle           = T(Q(V(0,0),V(12.3,1.28)),L(V(13.5,1.28),V(13.5,-1.2)),L(V(13.5,-1.2),V(11,-1.2)),L(V(11,-1.2),V(11,1.28)),L(V(13.5,1.28),V(11,1.28)),L(V(-1.18,1.28),V(1.3,1.28)),L(V(1.3,1.28),V(1.3,-1.2)),L(V(-1.18,-1.2),V(1.3,-1.2)),L(V(-1.18,-1.2),V(-1.18,1.28)))
  val copy             = T(Q(V(-9,-6.6),V(-7.3,-2.7)),Q(V(4,0),V(0,0)),Q(V(7.6,3),V(7.6,7)),L(V(-4.7,8.6),V(1.3,10)),L(V(1.3,10),V(-1,4.4)),L(V(-2,4.4),V(-2.2,5.6)),L(V(-2.2,5.6),V(-9.4,0)),L(V(-9.4,0),V(-11,1.8)),L(V(-11,1.8),V(-4.5,7)),L(V(-3.5,7),V(-4.7,8.6)))

  val explode          = T(L(V(3.41,12.3),V(9.6,5.15)),L(V(6.47,12.5),V(6.55,3.3)),L(V(-0.4,9.71),V(13.4,7.73)),L(V(-0.154,3.16),V(2.9,0)),L(V(2.9,0),V(-10.4,-13.2)),L(V(-10.4,-13.2),V(-13.4,-10.1)),L(V(-13.4,-10.1),V(-0.154,3.16)),L(V(-13.4,-10.1),V(-0.154,3.16)),L(V(-13.4,-10.1),V(-0.154,3.16)),L(V(6.5,8.72),V(2.96,5.88)),A(V(6.5,8.72),V(2.96,5.88),V(1.37,1.63)))
  val group            = T(L(V(-10.6,3),V(-2,3)),L(V(-2,3),V(-2,-6.5)),L(V(-10.6,-6.5),V(-10.6,3)),L(V(-2,-6.5),V(-10.6,-6.5)),L(V(2,-2),V(10.6,-2)),L(V(10.6,-2),V(10.6,6.5)),L(V(2,6.5),V(2,-2)),L(V(10.6,6.5),V(2,6.5)),L(V(13.2,-9),V(13.2,9)),L(V(-13.2,-9),V(13.2,-9)),L(V(-13.2,-9),V(-13.2,9)),L(V(-13.2,9),V(13.2,9)),L(V(12.2,-8),V(12.2,8)),L(V(-12.2,8),V(12.2,8)),L(V(-12.2,8),V(-12.2,-8)),L(V(-12.2,-8),V(12.2,-8)))
  val line             = T(L(V(-12,-3),V(12,3)))
  val linearDimension  = T(L(V(-9.5,-3.39),V(-13.9,3.72)),L(V(-11.5,7.72),V(-11.5,-2.39)),L(V(11.7,-2.39),V(11.7,5.72)),L(V(9.5,3.72),V(13.9,-3.46)),L(V(11.7,7.46),V(11.7,-2.17)),L(V(14.5,0),V(-14.5,0)))
  val offset           = T(L(V(-0.8,2.19),V(0.921,5.35)),L(V(0.921,5.35),V(5.11,3.12)),L(V(5.11,3.12),V(5.86,4.53)),L(V(5.86,4.53),V(10.7,-1.94)),L(V(10.7,-1.94),V(2.67,-1.48)),L(V(2.67,-1.48),V(3.48,-0.102)),L(V(3.48,-0.102),V(-0.8,2.19)),L(V(-4.63,13),V(-1.47,4.15)),A(V(-1.47,4.15),V(-9.6,-0.7),V(-13.6,-9.46)),L(V(7.46,13.6),V(13.5,-3.29)),L(V(13.5,-3.29),V(5.21,-5.5)),A(V(5.21,-5.5),V(0.1,-8.1),V(-1.13,-12.6)))
  val polyline         = T(L(V(-10.62,11),V(-12.48,11)),L(V(-10.62,9.5),V(-10.62,11)),L(V(-12.48,9.5),V(-10.62,9.5)),L(V(-7.11,11),V(-7.11,9.5)),L(V(-5.25,11),V(-7.11,11)),L(V(-5.25,9.5),V(-5.25,11)),L(V(-7.11,9.5),V(-5.25,9.5)),L(V(-7.11,0.86),V(-7.11,-1.0)),L(V(-5.25,0.86),V(-7.11,0.86)),L(V(-5.25,-1.0),V(-5.25,0.86)),L(V(-7.11,-1.0),V(-5.25,-1.0)),L(V(-0.46,-7.86),V(-0.46,-9.72)),L(V(1.4,-7.86),V(-0.46,-7.86)),L(V(1.4,-9.72),V(1.4,-7.86)),L(V(-0.46,-9.72),V(1.4,-9.72)),L(V(10.34,-2.64),V(10.34,-4.5)),L(V(12.2,-2.64),V(10.34,-2.64)),L(V(12.2,-4.5),V(12.2,-2.64)),L(V(10.34,-4.5),V(12.2,-4.5)),L(V(-6.09,-0.08),V(0.56,-8.79)),L(V(-6.09,10.3),V(-6.09,-0.08)),L(V(-11.46,10.3),V(-6.09,10.3)),L(V(-12.48,11),V(-12.48,9.5)),A(V(0.56,-8.79),V(8.94,-10.09),V(11.36,-3.58)))
  val raster           = T(L(V(5.16,1.69),V(5.08,-6.98)),L(V(-0.32,2.24),V(5.16,1.69)),L(V(-0.4,-8.97),V(-0.32,2.24)),L(V(-6.68,-11.35),V(-0.4,-8.97)),L(V(-7.08,10.83),V(-6.68,-11.35)),L(V(11.04,4.79),V(-7.08,10.83)),L(V(10.88,-4.2),V(11.04,4.79)),L(V(5.08,-6.98),V(10.88,-4.2)),L(V(-0.17,8.52),V(10.9,-3.43)),L(V(3.77,7.21),V(10.95,-0.54)),L(V(7.71,5.9),V(11.0,2.35)),L(V(-6.91,1.08),V(-0.38,-5.96)),L(V(-6.85,-1.92),V(-0.4,-8.89)),L(V(-6.8,-4.92),V(-2.37,-9.71)),L(V(-6.75,-7.93),V(-4.38,-10.48)),L(V(-6.96,4.08),V(-0.36,-3.04)),L(V(-4.12,9.84),V(3.26,1.88)),L(V(5.14,-0.16),V(9.5,-4.86)),L(V(-7.07,10.08),V(0.25,2.18)),L(V(5.12,-3.07),V(7.61,-5.77)),L(V(-7.01,7.08),V(-0.34,-0.12)),L(V(5.09,-5.99),V(5.72,-6.67)))
  val rectangle        = T(L(V(-7.01,-13.5),V(-7.01,-11)),L(V(-7.01,-11),V(-9.49,-11)),L(V(-9.49,-13.5),V(-9.49,-11)),L(V(-9.49,-13.5),V(-7.01,-13.5)),L(V(9.49,11),V(9.49,13.5)),L(V(9.49,11),V(7.01,11)),L(V(7.01,11),V(7.01,13.5)),L(V(7.01,13.5),V(9.49,13.5)),L(V(8.25,-12.3),V(8.25,12.3)),L(V(8.25,12.3),V(-8.25,12.3)),L(V(-8.25,-12.3),V(8.25,-12.3)),L(V(-8.25,12.3),V(-8.25,-12.3)))
  val text             = T(L(V(-1.5,-11),V(1.5,-11)),L(V(1.5,-11),V(1.5,8)),L(V(-1.5,8),V(-9.5,8)),L(V(-9.5,8),V(-9.5,11)),L(V(-9.5,11),V(9.5,11)),L(V(9.5,11),V(9.5,8)),L(V(9.5,8),V(1.5,8)),L(V(-1.5,8),V(-1.5,-11)))

  //HELPERS
  val area         = T(L(V(7,12),V(7,2)),L(V(7,2),V(10,-8)),L(V(10,-8),V(-8,-12)),L(V(-8,-12),V(-13,3)),L(V(-13,3),V(-10,12)),L(V(-10,12),V(7,12)),A(V(-3,-1),V(-2.3,0.4),V(-1,1.7)),A(V(-2,1.0),V(0,5.5),V(-8.4,6.0)),Q(V(-3,-4),V(-1.6,-4)))
  val distance     = T(L(V(6,10),V(12,4)),L(V(-13,-10),V(-7,-16)),L(V(-12,-12),V(-7,-7)),L(V(2,2),V(9,9)),A(V(-3,-1),V(-2.3,0.4),V(-1,1.7)),A(V(-2,1.0),V(0,5.5),V(-8.4,6.0)),Q(V(-3,-4),V(-1.6,-4)))
  val endPointSnap = T(L(V(-9,-9),V(9,9)),Q(V(-9,-9),V(-12,-9)),Q(V(9,9),V(12,9)))
  val grid         = T(L(V(7,-12),V(7,12)),L(V(-7,-12),V(-7,12)),L(V(-12,7),V(12,7)),L(V(-12,-7),V(12,-7)))
  val gridScale    = T(L(V(-13,-3),V(13,-3)),L(V(-13,11),V(11,11)),L(V(-3,-13),V(-3,13)),L(V(11,-13),V(11,11)),L(V(-9,0),V(-9,4)),L(V(-9,4),V(-12,8)),L(V(-9,4),V(-6,8)),L(V(1,-5),V(7,-12)),L(V(7,-5),V(1,-12)))
  val gridType     = T(L(V(-13,6),V(8,6)),L(V(-13,6),V(13,-6)),L(V(0,-11),V(-12,9)),L(V(10.7,-9),V(-1,11)))
  val guides       = T(L(V(13,11),V(13,13.5)),L(V(13,13.5),V(11,13.5)),L(V(11,13.5),V(11,11)),L(V(11,11),V(13,11)),L(V(3.32,1.34),V(3.32,3.82)),L(V(3.32,3.82),V(0.842,3.82)),L(V(0.842,1.34),V(0.842,3.82)),L(V(0.842,1.34),V(3.32,1.34)),L(V(-4.13,-8.96),V(-4.13,-3.18)),L(V(-4.13,-3.18),V(-9.9,-3.18)),L(V(-9.9,-8.96),V(-9.9,-3.18)),L(V(-9.9,-8.96),V(-4.13,-8.96)),L(V(-7.02,-6.06),V(-5.5,-4.62)),L(V(-2.47,-1.74),V(-0.952,-0.3)),L(V(2.08,2.58),V(12.3,12.3)),L(V(-7.02,-12.7),V(-7.02,0.535)),L(V(-0.417,-6.06),V(-13.6,-6.06)))
  val hide         = T(L(V(6.33,10),V(2.73,10)),L(V(6.33,10),V(6.33,7.99)),L(V(6.33,3.96),V(6.33,5.97)),L(V(6.33,3.96),V(2.73,3.96)),L(V(-0.872,3.96),V(-4.47,3.96)),L(V(-4.47,3.96),V(-4.47,5.97)),L(V(-4.47,10),V(-4.47,7.99)),L(V(-0.872,10),V(-4.47,10)),L(V(-10.7,-0.697),V(-7.58,-0.697)),L(V(-1.26,-0.697),V(-4.42,-0.697)),L(V(-1.26,-0.697),V(-1.26,-3.03)),L(V(-1.26,-7.7),V(-1.26,-5.36)),L(V(-1.26,-7.7),V(-4.42,-7.7)),L(V(-7.58,-7.7),V(-10.7,-7.7)),L(V(-10.7,-7.7),V(-10.7,-5.36)),L(V(-10.7,-0.697),V(-10.7,-3.03)),A(V(8.49,-1.37),V(10.9,-3.83),V(11.2,-7.28)),A(V(9.17,-10.1),V(5.83,-11),V(2.71,-9.46)),A(V(1.29,-6.32),V(2.21,-2.99),V(5.05,-1.04)))
  val midPointSnap = T(L(V(-9,-9),V(9,9)),Q(V(0,0),V(0,3)))
  val perspective  = T(L(V(-8.95,-7.9),V(8.94,-7.9)),L(V(-8.41,4.34),V(8.4,4.34)),L(V(-6.15,-4.21),V(6.13,-4.22)),L(V(6.13,1.06),V(-6.16,1.06)),L(V(-3.76,1.06),V(-3.73,-4.21)),L(V(3.74,1.06),V(3.72,-4.22)),L(V(-3.73,-4.21),V(-10.4,-8.92)),L(V(3.72,-4.22),V(10.39,-8.92)),L(V(3.74,1.06),V(10.39,5.75)),L(V(-3.76,1.06),V(-10.4,5.75)),L(V(10.39,-1.58),V(3.73,-1.57)),L(V(-3.74,-1.57),V(-10.4,-1.56)))
  val selectAll    = T(Q(V(6.31,-5.96),V(5.83,-11)),L(V(-4.47,10),V(6.33,10)),L(V(-4.47,3.96),V(6.33,3.96)),L(V(-4.47,10),V(-4.47,3.96)),L(V(6.33,3.96),V(6.33,10)),L(V(-10.7,-0.697),V(-1.26,-0.697)),L(V(-10.7,-7.7),V(-1.26,-7.7)),L(V(-10.7,-0.697),V(-10.7,-7.7)),L(V(-1.26,-7.7),V(-1.26,-0.697)),L(V(-12.7,1.3),V(-6.47,1.3)),L(V(-6.47,1.3),V(-6.47,12)),L(V(-6.47,12),V(8.33,12)),L(V(8.33,12),V(8.33,0.831)),A(V(8.33,0.831),V(12,-10),V(0.5,-9.7)),L(V(0.5,-9.7),V(-12.7,-9.7)),L(V(-12.7,-9.7),V(-12.7,1.3)))
  val selectSame   = T(Q(V(7.6,-5.96),V(7,-11)),L(V(-4.47,10),V(6.33,10)),L(V(-4.47,3.96),V(6.33,3.96)),L(V(-4.47,10),V(-4.47,3.96)),L(V(6.33,3.96),V(6.33,10)),L(V(-10.7,-0.697),V(-1.26,-0.697)),L(V(-10.7,-7.7),V(-1.26,-7.7)),L(V(-10.7,-0.697),V(-10.7,-7.7)),L(V(-1.26,-7.7),V(-1.26,-0.697)),L(V(-6.47,1.3),V(-6.47,12)),L(V(-6.47,12),V(8.33,12)),L(V(8.33,12),V(8.33,1.96)),L(V(8.33,1.96),V(0.365,1.96)),L(V(0.365,1.96),V(0.365,-9.7)),L(V(0.365,-9.7),V(-12.7,-9.7)),L(V(-12.7,-9.7),V(-12.7,1.3)),L(V(-12.7,1.3),V(-6.47,1.3)))
  val show         = T(Q(V(6.31,-5.96),V(5.83,-11)),L(V(-4.47,10),V(6.33,10)),L(V(-4.47,3.96),V(6.33,3.96)),L(V(-4.47,10),V(-4.47,3.96)),L(V(6.33,3.96),V(6.33,10)),L(V(-10.7,-0.697),V(-1.26,-0.697)),L(V(-10.7,-7.7),V(-1.26,-7.7)),L(V(-10.7,-0.697),V(-10.7,-7.7)),L(V(-1.26,-7.7),V(-1.26,-0.697)))
  val snap         = T(L(V(-10.4,8.77),V(-10.4,11.2)),L(V(-10.4,11.2),V(-7.88,11.2)),L(V(-7.88,11.2),V(-7.88,8.77)),L(V(-7.88,8.77),V(-10.4,8.77)),L(V(8.14,-8.14),V(8.14,-5.67)),L(V(8.14,-5.67),V(5.66,-5.67)),L(V(5.66,-8.14),V(5.66,-5.67)),L(V(5.66,-5.67),V(8.14,-5.67)),L(V(9.79,-9.79),V(9.79,-4.02)),L(V(9.79,-4.02),V(4.01,-4.02)),L(V(4.01,-9.79),V(4.01,-4.02)),L(V(4.01,-9.79),V(9.79,-9.79)),L(V(6.9,-13.5),V(6.9,-0.3)),L(V(13.5,-6.9),V(0.3,-6.9)),L(V(6.9,-6.9),V(-9.11,10)))

  //MODIFY
  val align   = T(L(V(13.5,13.5),V(13.5,-13.5)),L(V(13.5,-13.5),V(5.16,-13.5)),L(V(5.16,-13.5),V(5.16,13.5)),L(V(5.16,13.5),V(13.5,13.5)),L(V(-4.33,-13.5),V(-1.5,-10.7)),L(V(-1.5,-10.7),V(-10.7,-1.48)),L(V(-10.7,-1.48),V(-13.5,-4.31)),L(V(-13.5,-4.31),V(-4.33,-13.5)),L(V(2.47,9.82),V(-2.49,6.75)),L(V(1.6,-9.19),V(-1.5,-10.7)),L(V(13.5,13.5),V(7.84,12.1)),L(V(-6.92,2.96),V(-10.7,-1.48)),L(V(13.5,-13.5),V(11.3,-10.9)),L(V(8.3,-9.27),V(4.95,-8.66)))
  val chamfer = T(L(V(-13.5,13.5),V(0,13.5)),L(V(0,13.5),V(13.5,0)),L(V(13.5,0),V(13.5,-13.5)),L(V(4,13.5),V(8,13.5)),L(V(12,13.5),V(13.5,13.5)),L(V(13.5,13.5),V(13.5,12)),L(V(13.5,8),V(13.5,4)))
  val divide  = T(L(V(-6.41,4.46),V(-4.07,2.14)),L(V(-1.54,-0.37),V(0.8,-2.69)),L(V(3.34,-5.2),V(5.67,-7.52)),L(V(-3.67,-0.03),V(-1.94,-0.03)),L(V(-1.94,-0.03),V(-1.94,1.77)),L(V(-1.94,1.77),V(-3.67,1.77)),L(V(-3.67,1.77),V(-3.67,-0.03)),L(V(6.07,-9.69),V(7.81,-9.69)),L(V(7.81,-9.69),V(7.81,-7.89)),L(V(7.81,-7.89),V(6.07,-7.89)),L(V(6.07,-7.89),V(6.07,-9.69)),L(V(1.2,-4.86),V(2.94,-4.86)),L(V(2.94,-4.86),V(2.94,-3.06)),L(V(2.94,-3.06),V(1.2,-3.06)),L(V(1.2,-3.06),V(1.2,-4.86)),L(V(-8.54,4.8),V(-6.81,4.8)),L(V(-6.81,4.8),V(-6.81,6.6)),L(V(-6.81,6.6),V(-8.54,6.6)),L(V(-8.54,6.6),V(-8.54,4.8)))
  val extend  = T(L(V(-13.5,-13.5),V(-4,-4)),L(V(-1,-1),V(2,2)),L(V(5,5),V(8.5,8.5)),L(V(3.5,13),V(13,3.5)))
  val connect = T(L(V(-13.5,13.5),V(0,13.5)),A(V(-4,13.5),V(8,8.7),V(13.5,-4)),L(V(13.5,0),V(13.5,-13.5)),L(V(2,13.5),V(6,13.5)),L(V(12,13.5),V(13.5,13.5)),L(V(13.5,13.5),V(13.5,12)),L(V(13.5,6),V(13.5,2)))
  val move    = T(L(V(-3,7.5),V(-1.5,7.5)),L(V(-1.5,7.5),V(-1.5,1.5)),L(V(-1.5,1.5),V(-7.5,1.5)),L(V(-7.5,1.5),V(-7.5,3)),L(V(-7.5,3),V(-13,0)),L(V(-13,0),V(-7.5,-3)),L(V(-7.5,-3),V(-7.5,-1.5)),L(V(-7.5,-1.5),V(-1.5,-1.5)),L(V(-1.5,-1.5),V(-1.5,-7.5)),L(V(-1.5,-7.5),V(-3,-7.5)),L(V(-3,-7.5),V(0,-14)),L(V(0,-14),V(3,-7.5)),L(V(3,-7.5),V(1.5,-7.5)),L(V(1.5,-7.5),V(1.5,-1.5)),L(V(1.5,-1.5),V(7.5,-1.5)),L(V(7.5,-1.5),V(7.5,-3)),L(V(7.5,-3),V(13,0)),L(V(13,0),V(7.5,3)),L(V(7.5,3),V(7.5,1.5)),L(V(7.5,1.5),V(1.5,1.5)),L(V(1.5,1.5),V(1.5,7.5)),L(V(1.5,7.5),V(3,7.5)),L(V(3,7.5),V(0,13)),L(V(0,13),V(-3,7.5)))
  val mirror  = T(L(V(0,-12.5),V(0,-13.5)),L(V(0,1),V(0,-1)),L(V(0,13.5),V(0,12.5)),L(V(0,-10.1),V(0,-3.38)),L(V(0,3.37),V(0,10.1)),L(V(-13.5,-13.5),V(-3.75,13.5)),L(V(-3.75,13.5),V(-3.75,-13.5)),L(V(-3.75,-13.5),V(-13.5,-13.5)),L(V(13.5,-13.5),V(3.75,-13.5)),L(V(3.75,-13.5),V(3.75,13.5)),L(V(3.75,13.5),V(13.5,-13.5)))
  val rotate  = T(L(V(11,2.9),V(12.3,2.9)),L(V(12.3,2.9),V(9.5,-2.8)),L(V(9.5,-2.8),V(6.6,2.9)),L(V(6.6,2.9),V(8.1,2.9)),L(V(6.2,-5.9),V(8.3,-7.9)),A(V(6.2,-5.9),V(-8.5,1.8),V(8.1,2.9)),A(V(11,2.9),V(-11,2.9),V(8.3,-7.9)))
  val scale   = T(L(V(-2,0),V(2.4,6.8)),L(V(2.4,6.8),V(1.3,7.5)),L(V(1.3,7.5),V(7,11)),L(V(7,11),V(6,4.4)),L(V(6,4.4),V(5,5.2)),L(V(5,5.2),V(0.5,1.5)),L(V(0.5,1.5),V(-2,0)),L(V(-8.3,-12.3),V(-8.3,12.7)),L(V(-8.3,12.7),V(8.3,12.7)),L(V(8.3,12.7),V(8.3,-12.3)),L(V(8.3,-12.3),V(-8.3,-12.3)),L(V(-8.33,-2.3),V(-1.67,-2.3)),L(V(-1.67,-2.3),V(-1.67,-12.3)),L(V(-1.67,-12.3),V(-8.33,-12.3)),L(V(-8.33,-12.3),V(-8.33,-2.3)))
  val trim    = T(L(V(-13.5,-13.5),V(-4,-4)),L(V(-1,-1),V(2,2)),L(V(5,5),V(8.5,8.5)),L(V(-9,1),V(1,-9)))

  // PropertiesCategory
  val colorWheel       = T(L(V(-1.54,9.09),V(1.59,9.09)),L(V(1.59,9.09),V(2.31,13.2)),L(V(2.31,13.2),V(-2.26,13.2)),L(V(-2.26,13.2),V(-1.54,9.09)),L(V(5.19,7.6),V(7.4,5.39)),L(V(7.4,5.39),V(10.8,7.77)),L(V(10.8,7.77),V(7.57,11)),L(V(7.57,11),V(5.19,7.6)),L(V(8.89,1.79),V(8.89,-1.34)),L(V(8.89,-1.34),V(13,-2.06)),L(V(13,-2.06),V(13,2.51)),L(V(13,2.51),V(8.89,1.79)),L(V(7.4,-4.94),V(5.19,-7.15)),L(V(5.19,-7.15),V(7.57,-10.5)),L(V(7.57,-10.5),V(10.8,-7.32)),L(V(10.8,-7.32),V(7.4,-4.94)),L(V(1.59,-8.64),V(-1.54,-8.64)),L(V(-1.54,-8.64),V(-2.26,-12.7)),L(V(-2.26,-12.7),V(2.31,-12.7)),L(V(2.31,-12.7),V(1.59,-8.64)),L(V(-5.14,-7.15),V(-7.35,-4.94)),L(V(-7.35,-4.94),V(-10.8,-7.32)),L(V(-10.8,-7.32),V(-7.52,-10.5)),L(V(-7.52,-10.5),V(-5.14,-7.15)),L(V(-8.84,-1.34),V(-8.84,1.79)),L(V(-8.84,1.79),V(-12.9,2.51)),L(V(-12.9,2.51),V(-12.9,-2.06)),L(V(-12.9,-2.06),V(-8.84,-1.34)),L(V(-7.35,5.39),V(-5.14,7.6)),L(V(-5.14,7.6),V(-7.52,11)),L(V(-7.52,11),V(-10.8,7.77)),L(V(-10.8,7.77),V(-7.35,5.39)))
  val pattern          = T(L(V(-7,-10),V(-10,-7)),L(V(-3.5,-10),V(-10,-3.5)),L(V(0,-10),V(-10,0)),L(V(3.5,-10),V(-10,3.5)),L(V(7,-10),V(-10,7)),L(V(10,-7),V(-7,10)),L(V(10,-3.5),V(-3.5,10)),L(V(10,0),V(0,10)),L(V(10,3.5),V(3.5,10)),L(V(10,7),V(7,10)))
  val sampleProperties = T(L(V(0.437,6.7),V(2.12,8.38)),L(V(2.12,8.38),V(8.36,2.13)),L(V(8.36,2.13),V(6.68,0.453)),L(V(6.68,0.453),V(0.437,6.7)),L(V(11.6,7.08),V(7.5,3)),L(V(7.07,11.6),V(2.98,7.52)),A(V(11.6,7.08),V(11.6,11.6),V(7.07,11.6)),L(V(-9.15,-10.5),V(-6.34,-8.89)),L(V(-6.34,-8.89),V(4.85,2.28)),L(V(2.28,4.85),V(-8.93,-6.3)),L(V(-8.93,-6.3),V(-10.5,-9.11)),L(V(1.94,3.03),V(-11.7,-10.6)),L(V(-11.7,-10.6),V(-13.3,-12.3)),L(V(1.94,3.03),V(3.03,1.94)),L(V(3.03,1.94),V(-10.6,-11.7)),L(V(-10.6,-11.7),V(-12.3,-13.3)))
  val styles           = T(L(V(-3.85,-0.578),V(-11.1,-0.578)),L(V(10.7,-0.578),V(3.42,-0.578)),L(V(10.7,-7.69),V(7.58,-7.69)),L(V(-8.01,-7.69),V(-11.1,-7.69)),L(V(-1.77,-7.69),V(-4.89,-7.69)),L(V(4.46,-7.69),V(1.35,-7.69)),L(V(10.7,7.13),V(-11.1,7.13)))
  val test             = T(L(V(-6.39,5.4),V(-10.65,5.4)),L(V(-10.65,5.4),V(-10.65,5.17)),L(V(-8.6,5.17),V(-8.6,-4.7)),L(V(-8.6,-4.7),V(-8.43,-4.7)),L(V(-0.41,-4.59),V(-3.73,-4.59)),L(V(-1.26,0.74),V(-1.26,0.96)),L(V(-1.26,0.96),V(-3.73,0.96)),L(V(-0.41,5.17),V(-0.41,5.4)),L(V(-0.41,5.4),V(-3.9,5.4)),L(V(-3.9,5.4),V(-3.9,-4.79)),L(V(2.61,4.45),V(3.92,5.17)),L(V(6.01,4.73),V(3.92,5.4)),L(V(2.48,4.59),V(2.05,3.07)),L(V(2.05,3.07),V(2.7,1.25)),L(V(2.7,1.25),V(3.58,0.6)),L(V(3.58,0.6),V(4.87,-0.23)),L(V(4.87,-0.23),V(5.86,-1.08)),L(V(5.86,-1.08),V(6.31,-2.5)),L(V(2.08,-3.67),V(3.33,-4.48)),L(V(3.33,-4.48),V(4.69,-4.79)),L(V(4.69,-4.79),V(6.03,-4.02)),L(V(6.03,-4.02),V(6.48,-2.5)),L(V(13.22,5.4),V(8.97,5.4)),L(V(8.97,5.4),V(8.97,5.17)),L(V(11.01,5.17),V(11.01,-4.7)),L(V(11.01,-4.7),V(11.18,-4.7)))
  val weight           = T(L(V(-4.59,7.95),V(-13.77,2.65)),L(V(4.59,7.95),V(-4.59,13.25)),L(V(9.18,0.0),V(9.18,10.6)),L(V(4.59,-7.95),V(13.77,-2.65)),L(V(-4.59,-7.95),V(4.59,-13.25)),L(V(-9.18,0.0),V(-9.18,-10.6)),L(V(-4.79,8.3),V(-13.97,3.0)),L(V(-9.58,0.0),V(-9.58,-10.6)),L(V(-9.98,0.0),V(-9.98,-10.6)),L(V(-4.79,-8.3),V(4.39,-13.6)),L(V(-4.99,-8.65),V(4.19,-13.95)),L(V(-5.19,-8.99),V(3.99,-14.29)),L(V(4.79,-8.3),V(13.97,-3.0)),L(V(4.99,-8.65),V(14.17,-3.34)),L(V(5.19,-8.99),V(14.37,-3.69)),L(V(5.39,-9.34),V(14.57,-4.04)),L(V(9.58,0.0),V(9.58,10.6)),L(V(9.98,0.0),V(9.98,10.6)),L(V(10.38,0.0),V(10.38,10.6)),L(V(10.78,0.0),V(10.78,10.6)),L(V(11.18,0.0),V(11.18,10.6)))

  // FileCategory
  val print     = T(L(V(5.83,2.19),V(7.87,0.676)),L(V(7.87,0.676),V(9.74,1.42)),L(V(9.74,1.42),V(9.82,5.8)),L(V(9.82,5.8),V(5.18,8.81)),L(V(5.18,8.81),V(3.59,8.28)),L(V(3.59,8.28),V(-9.36,4)),L(V(-9.36,4),V(-13.3,2.71)),L(V(-13.3,2.71),V(-13.2,-0.901)),L(V(-13.2,-0.901),V(-8.65,-5.88)),L(V(-8.65,-5.88),V(-4.22,-4.13)),L(V(1.38,11.4),V(-11.1,7.22)),L(V(-11.1,7.22),V(-8.07,1.65)),L(V(-8.07,1.65),V(4.85,6.5)),L(V(4.85,6.5),V(1.38,11.4)),L(V(5.83,2.19),V(-5.83,-2.19)),L(V(-5.83,-2.19),V(-2.67,-6)),L(V(-2.67,-6),V(0.587,-8)),L(V(0.587,-8),V(13.5,-2.14)),L(V(13.5,-2.14),V(9.24,-0.34)),L(V(9.24,-0.34),V(5.83,2.19)))
  val exportDXF = T(L(V(-7.87,-11.68),V(-11.38,-8.17)),L(V(-6.26,-11.68),V(7.4,-11.68)),L(V(7.4,-11.68),V(7.4,-5.07)),L(V(7.4,-5.07),V(-6.26,-5.07)),L(V(-6.26,-5.07),V(-6.26,-11.68)),L(V(-5.16,-10.6),V(-2.33,-10.6)),L(V(-2.33,-10.6),V(-2.33,-6.06)),L(V(-2.33,-6.06),V(-5.16,-6.06)),L(V(-5.16,-6.06),V(-5.16,-10.6)),L(V(-7.87,-11.68),V(11.38,-11.68)),L(V(11.38,-11.68),V(11.38,9.77)),L(V(11.38,9.77),V(-11.38,9.77)),L(V(-11.38,9.77),V(-11.38,-8.17)),L(V(8.73,9.77),V(-8.76,9.77)),L(V(-4.32,4.09),V(-4.32,0.81)),L(V(2.39,-1.85),V(2.55,-1.76)),L(V(-0.33,2.24),V(2.39,-1.85)),L(V(-3.06,-1.85),V(-0.33,2.24)),L(V(-3.21,-1.76),V(-3.06,-1.85)),L(V(-3.21,6.57),V(-0.44,2.41)),L(V(-3.06,6.68),V(-3.21,6.57)),L(V(2.55,6.57),V(2.39,6.68)),L(V(-0.22,2.41),V(2.55,6.57)),L(V(4.5,2.83),V(8.14,2.83)),L(V(4.5,-1.77),V(4.5,2.83)),L(V(4.31,-1.77),V(4.5,-1.77)),L(V(4.31,6.77),V(4.31,-1.77)),L(V(8.14,6.77),V(4.31,6.77)),L(V(8.14,6.57),V(8.14,6.77)),L(V(4.5,6.57),V(8.14,6.57)),L(V(4.5,3.01),V(4.5,6.57)),L(V(8.14,3.01),V(4.5,3.01)),L(V(-8.98,-1.68),V(-6.97,-1.68)),L(V(-8.98,6.54),V(-8.98,-1.68)),L(V(-6.97,6.54),V(-8.98,6.54)),L(V(-4.5,0.8),V(-4.5,4.07)),L(V(-4.56,-0.3),V(-4.32,0.81)),L(V(-5.26,-1.18),V(-4.56,-0.3)),L(V(-6.97,-1.85),V(-5.26,-1.18)),L(V(-9.17,-1.85),V(-6.97,-1.85)),L(V(-9.17,6.77),V(-9.17,-1.85)),L(V(-6.97,6.77),V(-9.17,6.77)),L(V(-5.26,6.09),V(-6.97,6.77)),L(V(-4.56,5.2),V(-5.26,6.09)),L(V(-4.32,4.09),V(-4.56,5.2)))
  val importDXF = T(L(V(-4.2,8.18),V(-2.31,6.01)),L(V(-7.79,8.18),V(-4.2,8.18)),L(V(-9.77,6.01),V(-7.79,8.18)),L(V(-9.77,-6.36),V(-9.77,6.01)),L(V(7.6,-6.36),V(-9.77,-6.36)),L(V(11.94,4.17),V(7.6,-6.36)),L(V(-4.96,4.17),V(11.94,4.17)),L(V(-9.77,-6.36),V(-4.96,4.17)),L(V(7.6,6.01),V(7.6,4.17)),L(V(7.6,6.01),V(-2.31,6.01)),L(V(-2.28,8.8),V(-3.18,10.69)),L(V(-3.18,10.69),V(-4.8,11.33)),L(V(-4.8,11.33),V(-6.88,11.33)),L(V(-6.88,11.33),V(-6.88,3.17)),L(V(-2.45,5.68),V(-2.45,8.77)),L(V(5.54,11.25),V(2.96,7.36)),L(V(0.24,11.14),V(2.86,7.2)),L(V(11.78,7.77),V(8.33,7.77)),L(V(11.78,11.33),V(8.15,11.33)),L(V(-3.0,4.17),V(-2.28,5.69)),L(V(2.86,7.2),V(0.84,4.17)),L(V(2.96,7.04),V(4.87,4.17)),L(V(8.15,11.33),V(8.15,4.17)),L(V(-6.88,3.17),V(-5.41,3.17)))
  val load      = T(L(V(1.97,14.07),V(-0.1,10.73)),L(V(-3.65,14.07),V(-1.57,10.73)),L(V(-3.65,14.07),V(1.97,14.07)),L(V(3.36,14.07),V(8.98,14.07)),L(V(3.36,14.07),V(5.43,10.73)),L(V(8.98,14.07),V(6.91,10.73)),L(V(-0.1,10.73),V(-0.3,4.17)),L(V(-1.57,10.73),V(-1.38,4.17)),L(V(5.43,10.73),V(5.63,4.17)),L(V(6.91,10.73),V(6.71,4.17)),L(V(-0.24,6.01),V(5.57,6.01)),A(V(6.77,6.01),V(7.6,6.01),V(7.6,4.17)),L(V(-9.77,-6.36),V(-4.96,4.17)),L(V(-4.96,4.17),V(11.94,4.17)),L(V(11.94,4.17),V(7.6,-6.36)),L(V(7.6,-6.36),V(-9.77,-6.36)),L(V(-9.77,-6.36),V(-9.77,6.01)),L(V(-9.77,6.01),V(-7.79,8.18)),L(V(-7.79,8.18),V(-4.2,8.18)),L(V(-4.2,8.18),V(-2.31,6.01)),L(V(-2.31,6.01),V(-1.44,6.01)))
  val save      = T(L(V(-7.87,-11.68),V(-11.38,-8.17)),L(V(-6.26,-11.68),V(7.4,-11.68)),L(V(-7.87,-11.68),V(11.38,-11.68)),L(V(11.38,-11.68),V(11.38,9.77)),L(V(11.38,9.77),V(-11.38,9.77)),L(V(-11.38,9.77),V(-11.38,-8.17)),L(V(8.73,9.77),V(-8.76,9.77)),L(V(3.79,5.58),V(3.52,-4.06)),L(V(2.91,5.58),V(3.18,-4.06)),L(V(5.52,7.91),V(3.79,5.58)),L(V(1.17,7.91),V(2.91,5.58)),L(V(1.17,7.91),V(5.52,7.91)),L(V(3.52,-4.06),V(3.18,-4.06)),L(V(-3.67,-4.06),V(-3.33,-4.06)),L(V(-1.32,7.91),V(-5.68,7.91)),L(V(-1.32,7.91),V(-3.06,5.58)),L(V(-5.68,7.91),V(-3.94,5.58)),L(V(-3.06,5.58),V(-3.33,-4.06)),L(V(-3.94,5.58),V(-3.67,-4.06)),L(V(-6.26,-6.27),V(-6.26,-11.68)),L(V(-5.16,-7.07),V(-5.16,-10.79)),L(V(-2.33,-7.07),V(-5.16,-7.07)),L(V(-2.33,-10.79),V(-2.33,-7.07)),L(V(-5.16,-10.79),V(-2.33,-10.79)),L(V(7.4,-6.27),V(-6.26,-6.27)),L(V(7.4,-11.68),V(7.4,-6.27)))
  val clearDB   = T(L(V(9.14,7.22),V(-7.29,7.33)),L(V(5.3,-10.5),V(9.14,7.22)),L(V(-5.89,-10.38),V(5.3,-10.5)),L(V(-7.29,7.33),V(-5.89,-10.38)),L(V(-1.88,13.68),V(6.46,7.33)),L(V(-5.42,7.33),V(-1.88,13.68)),L(V(0.62,13.62),V(-0.48,12.62)),L(V(7.65,7.23),V(0.62,13.62)),L(V(0.93,7.28),V(7.22,-1.64)),L(V(-5.42,7.33),V(5.93,-7.58)),L(V(-6.97,3.31),V(3.2,-10.5)),L(V(-6.59,-1.52),V(-0.3,-10.44)))

  val ENEArrow = T(A(V(7.3,-0.725),V(10.9,-7.89),V(14.1,-15.3)),L(V(14.1,-15.3),V(3.07,-19.7)),A(V(3.07,-19.7),V(0.152,-13),V(-3.16,-6.42)),L(V(-3.16,-6.42),V(-9.44,-9.84)),L(V(-9.44,-9.84),V(-8.45,12.6)),L(V(-8.45,12.6),V(13.4,2.61)),L(V(13.4,2.61),V(7.3,-0.725)))
  val WNWArrow = T(A(V(3.29,-6.29),V(-0.0254,-12.8),V(-2.94,-19.6)),L(V(-2.94,-19.6),V(-14,-15.1)),A(V(-14,-15.1),V(-10.8,-7.76),V(-7.18,-0.595)),L(V(-7.18,-0.595),V(-13.3,2.74)),L(V(-13.3,2.74),V(8.58,12.8)),L(V(8.58,12.8),V(9.57,-9.71)),L(V(9.57,-9.71),V(3.29,-6.29)))
  val WSWArrow = T(A(V(-7.14,0.63),V(-10.8,7.79),V(-14,15.2)),L(V(-14,15.2),V(-2.91,19.6)),A(V(-2.91,19.6),V(0.0122,12.9),V(3.32,6.32)),L(V(3.32,6.32),V(9.61,9.75)),L(V(9.61,9.75),V(8.62,-12.78)),L(V(8.62,-12.78),V(-13.3,-2.7)),L(V(-13.3,-2.7),V(-7.14,0.63)))
  val ESEArrow = T(A(V(-3.12,6.68),V(0.194,13.2),V(3.11,19.9)),L(V(3.11,19.9),V(14.2,15.5)),A(V(14.2,15.5),V(11,8.15),V(7.34,0.98)),L(V(7.34,0.98),V(13.5,-2.35)),L(V(13.5,-2.35),V(-8.41,-12.4)),L(V(-8.41,-12.4),V(-9.4,10.1)),L(V(-9.4,10.1),V(-3.12,6.68)))
  val SSEArrow = T(A(V(1.21,-6.08),V(-5.96,-9.71),V(-13.3,-12.9)),L(V(-13.3,-12.9),V(-17.8,-1.85)),A(V(-17.8,-1.85),V(-11,1.07),V(-4.49,4.38)),L(V(-4.49,4.38),V(-7.91,10.7)),L(V(-7.91,10.7),V(14.6,9.68)),L(V(14.6,9.68),V(4.54,-12.2)),L(V(4.54,-12.2),V(1.21,-6.08)))
  val SSWArrow = T(A(V(4.56,4.34),V(11.1,1.03),V(17.8,-1.89)),A(V(13.4,-13),V(6.03,-9.75),V(-1.14,-6.12)),L(V(17.8,-1.89),V(13.4,-13)),L(V(-1.14,-6.12),V(-4.47,-12.2)),L(V(-4.47,-12.2),V(-9.49,-1.3)),L(V(-9.49,-1.3),V(-14.5,9.64)),L(V(-14.5,9.64),V(7.98,10.6)))

  // Fillings
  val IconFill = Array(V(3.918,-25.88),V(2.438,-27.13),V(0.5904,-27.72),V(-1.342,-27.55),V(-3.062,-26.66),V(-23.34,-10.36),V(-24.57,-8.888),V(-25.15,-7.057),V(-25,-5.142),V(-24.12,-3.432),V(-19.6,2.705),V(-15.51,9.136),V(-11.87,15.83),V(-8.692,22.76),V(-7.651,24.32),V(-6.101,25.39),V(-4.267,25.8),V(-2.412,25.5),V(22.01,16.49),V(23.69,15.45),V(24.83,13.84),V(25.25,11.91),V(24.88,9.974),V(20.6,0.4781),V(15.67,-8.692),V(10.1,-17.49))
  //large category background
  val CategoryFill = Array(V(-72.27,80.26),V(-55.86,92.43),V(-37.46,101.3),V(-17.71,106.5),V(-9.357,102.1),V(0,100.5),V(9.357,102.1),V(17.71,106.5),V(37.46,101.3),V(55.86,92.43),V(72.27,80.26),V(101,112.2),V(83.33,125.9),V(63.79,136.9),V(42.85,144.8),V(20.96,149.5),V(11.4,156.2),V(0,158.5),V(-11.4,156.2),V(-20.96,149.5),V(-42.85,144.8),V(-63.79,136.9),V(-83.33,125.9),V(-101,112.2))
  val EventIconFill = Array(V(-10.53,153.1),V(-19.24,146.8),V(-24.62,137.5),V(-25.74,126.8),V(-22.42,116.6),V(-15.21,108.6),V(-5.382,104.2),V(5.382,104.2),V(15.21,108.6),V(22.42,116.6),V(25.74,126.8),V(24.62,137.5),V(19.24,146.8),V(10.53,153.1),V(0,155.4))
}