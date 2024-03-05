do_retroarch_config:append() {
  write_cfg_replace "input_player1_down_axis" "+1"
  write_cfg_replace "input_player1_left_axis" "-0"
  write_cfg_replace "input_player1_right_axis" "+0"
  write_cfg_replace "input_player1_up_axis" "-1"
  write_cfg_replace "log_verbosity" "true"
  write_cfg_replace "video_font_enable" "false"
}

