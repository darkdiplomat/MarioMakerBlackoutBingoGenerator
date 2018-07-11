package net.visualillusionsent.blackoutbingo;

/**
 * A enum of possible bingo tiles
 */
public enum BingoTiles {
    //Enemies
    KOOPA,
    LAKITU,
    DRY_BONES,
    WIGGLER,
    BOO,
    BOWSER,
    BOWSER_JR,
    MAGIKOOPA,
    BULLET_BILL,
    CHAIN_CHOMP,
    CHEEP_CHEEP,
    PIRANHA_PLANT,
    HAMMER_BRO,
    MONTY_MOLE,
    ROCKY_WRENCH,
    THOWMP,
    BUZZY_BEETLE,
    BLOOPER,
    SPIKE_TOP,
    SPINY,
    GOOMBA {
        @Override
        public String toString() {
            return "GOOMBA/GALOOMBA";
        }
    },
    BOB_OMB {
        @Override
        public String toString() {
            return "BOB-OMB";
        }
    },

    //Environment (Hazardous)
    SPIKE,
    MUNCHER,
    GRINDER,
    FIRE_BAR,
    CANNON,
    LAVA_BUBBLE,
    SKEWER,
    BURNERS,

    //Environment (Non-Hazardous)
    P_SWITCH,
    CLOWN_CAR,
    NAKED_PIPE,
    SPRING,
    VINE,
    RED_COINS,
    POW,
    LIFTS,
    MUSIC_BLOCK,
    DONUT_BLOCK,
    BUMPER,
    SKULL_RAFT,
    KEY_DOOR,
    P_DOOR,
    BLIND_JUMP,
    HIDDEN_BLOCK,
    ONE_WAY,
    SOUND_EFFECTS,
    TRACKS,
    CONVEYOR,
    SHOE,

    // Friendly Helpers
    YOSHI,
    MUSHROOM,
    FIRE_FLOWER,
    PROPELLER_CAP,
    STAR,
    LANKY_MARIO,
    MYSTERY_MUSHROOM,
    ONE_UP_MUSHROOM{
        @Override
        public String toString() {
            return "1-UP MUSHROOM";
        }
    },
    LEAF_FEATHER {
        @Override
        public String toString() {
            return "LEAF/FEATHER";
        }
    },

    // LEVEL STYLE
    SPEED_RUN,
    MAZE,
    PUZZLE,
    AUTO_SCROLL,
    AIR_SHIP_THEME,
    UNDERWATER_THEME,
    GHOST_HOUSE_THEME,
    CUSTOM_LEVEL_MUSIC,

    // Other
    SOFT_LOCK,
    FORCED_YOSHI_KILL,
    JEBAITED,
    PICK_A_PIPE_DOOR {
        @Override
        public String toString() {
            return "PICK A PIPE/DOOR";
        }
    },

}
