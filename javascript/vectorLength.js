#For a given 2D vector described by cartesian coordinates of its initial point and terminal point in the following format: [[x1, y1], [x2, y2]], your function must return this vector's length presented as a float.

#Error must be less than 0.0000001 * result.

#Coordinates can be integers or floats. 

sol:

function vectorLength(v){
  return Math.sqrt(Math.pow(v[0][0]-v[1][0], 2) + Math.pow(v[0][1]-v[1][1], 2));
