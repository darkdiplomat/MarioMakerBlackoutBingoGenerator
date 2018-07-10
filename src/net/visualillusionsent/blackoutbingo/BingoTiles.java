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
    MOLE,
    THOWMP,
    BUZZY_BEETLE,
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
    SPIKE_TOP {
        @Override
        public String toString() {
            return "SPIKE TOP/SPINY";
        }
    },

    //Environment (Hazardous)
    SPIKE,
    MUNCHER,
    SAW,
    FIRE_BAR,
    CANNON,
    LAVA_BUBBLE,

    //Environment (Non-Hazardous)
    P_SWITCH,
    CLOWN_CAR,
    NAKED_PIPE,
    SPRING,
    VINE,
    RED_COINS,
    POW,
    FALLING_PLATFORM,
    MUSIC_BLOCK,
    DONUTS,
    SKULL_RAFT,
    KEY_DOOR,
    BLIND_JUMP,

    // Friendly Helpers
    YOSHI,
    MUSHROOM,
    FIRE_FLOWER,
    PROPELLER_CAP,
    STAR,
    LANKY_MARIO,
    COSTUME,
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
    AIR_SHIP,
    UNDERGROUND,
    CASTLE,
    PICK_A_PIPE_DOOR {
        @Override
        public String toString() {
            return "PICK A PIPE/DOOR";
        }
    },
}
