category(have_a_nice_death, combat).
category(have_a_nice_death, adventure).

category(little_nighmares, adventure).
category(little_nighmares, survival_horror).

category(hollow_knight, combat).
category(hollow_knight, adventure).

category(league_of_lengends, moba).
category(league_of_lengends, strategy).

category(among_us, strategy).
category(among_us, survival_horror).

category(rise_of_nations, strategy).
category(rise_of_nations, moba).
category(rise_of_nations, historical).

category(diablo, adventure).
category(diablo, survival_horror).

category(ghost_of_a_tale, adventure).
category(ghost_of_a_tale, open_world).

category(resident_evil, survival_horror).
category(resident_evil, shooter).

category(detroit_become_human, strategy).
category(detroit_become_human, strategy).

category(the_last_of_us, adventure).
category(the_last_of_us, survival_horror).
category(the_last_of_us, combat).

category(god_of_war, adventure).
category(god_of_war, combat).


sub_category(have_a_nice_death, third_person).
sub_category(have_a_nice_death, fantasy).

sub_category(little_nighmares, fantasy).
sub_category(little_nighmares, horror).

sub_category(hollow_knight, fantasy).
sub_category(hollow_knight, action).
sub_category(hollow_knight, third_person).

sub_category(league_of_lengends, action).

sub_category(among_us, scify).
sub_category(among_us, horror).

sub_category(rise_of_nations, action).

sub_category(diablo, action).
sub_category(diablo, fantasy).
sub_category(diablo, horror).

sub_category(ghost_of_a_tale, fantasy).
sub_category(ghost_of_a_tale, third_person).

sub_category(resident_evil, third_person).
sub_category(resident_evil, horror).

sub_category(detroit_become_human, action).
sub_category(detroit_become_human, scify).
sub_category(detroit_become_human, third_person).

sub_category(the_last_of_us, horror).
sub_category(the_last_of_us, action).
sub_category(the_last_of_us, third_person).

sub_category(god_of_war, third_person).
sub_category(god_of_war, action).
sub_category(god_of_war, fantasy).

multiplayer(have_a_nice_death, not).

multiplayer(little_nighmares, not).

multiplayer(hollow_knight, not).

multiplayer(league_of_lengends, yes).

multiplayer(among_us, yes).

multiplayer(rise_of_nations, both).

multiplayer(diablo, both).

multiplayer(ghost_of_a_tale, not).

multiplayer(resident_evil, not).

multiplayer(detroit_become_human, not).

multiplayer(the_last_of_us, not).

multiplayer(god_of_war, not).

type_gamer(have_a_nice_death, hardcore).

type_gamer(little_nighmares, hardcore).

type_gamer(hollow_knight, hardcore).

type_gamer(league_of_lengends, casual).
type_gamer(league_of_lengends, competitive).

type_gamer(among_us, casual).

type_gamer(rise_of_nations, hardcore).
type_gamer(rise_of_nations, competitive).

type_gamer(diablo, hardcore).
type_gamer(diablo, competitive).

type_gamer(ghost_of_a_tale, casual).

type_gamer(resident_evil, hardcore).
type_gamer(resident_evil, competitive).

type_gamer(detroit_become_human, casual).
type_gamer(detroit_become_human, competitive).

type_gamer(the_last_of_us, hardcore).

type_gamer(god_of_war, hardcore).

platform(have_a_nice_death, pc).

platform(little_nighmares, pc).
platform(little_nighmares, console).

platform(hollow_knight, pc).
platform(hollow_knight, console).

platform(league_of_lengends, pc).

platform(among_us, pc).
platform(among_us, console).

platform(rise_of_nations, pc).

platform(diablo, pc).
platform(diablo, console).

platform(ghost_of_a_tale, pc).

platform(resident_evil, pc).

platform(detroit_become_human, pc).
platform(detroit_become_human, console).

platform(the_last_of_us, console).

platform(god_of_war, pc).
platform(god_of_war, console).

style(have_a_nice_death, dd).

style(little_nighmares, dd).

style(hollow_knight, dd).

style(league_of_lengends, dd).

style(among_us, dd).

style(rise_of_nations, dd).

style(diablo, dd).

style(ghost_of_a_tale, td).

style(resident_evil, td).

style(detroit_become_human, td).

style(the_last_of_us, td).

style(god_of_war, td).

next_questio_by_style(Y, Z):- findall( X =Z,style(Y,X), Y).
next_questio_by_category(Y, Z):- findall( X =Z,style(Y,X), Y).
next_questio_by_subcategory(Y, Z):- findall( X =Z,style(Y,X), Y).
next_questio_by_plataform(Y, Z):- findall( X =Z,platform(Y,X), Y).
next_questio_by_type_gamer(Y, Z):- findall( X =Z,type_gamer(Y,X), Y).
next_questio_by_multiplayer(Y, Z):- findall( X =Z,multiplayer(Y,X), Y).
next_questio_by_sub_category(Y, Z):- findall( X =Z,sub_category(Y,X), Y).