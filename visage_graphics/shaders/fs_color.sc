$input v_position, v_gradient_pos, v_gradient_color_pos

#include <shader_include.sh>

uniform vec4 u_color_mult;

SAMPLER2D(s_gradient, 0);

void main() {
  vec2 gradient_pos = gradient(v_gradient_color_pos.xy, v_gradient_color_pos.zw, v_gradient_pos.xy, v_gradient_pos.zw, v_position);
  gl_FragColor = u_color_mult * texture2D(s_gradient, gradient_pos);
}
