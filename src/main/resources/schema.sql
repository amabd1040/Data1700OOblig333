CREATE TABLE IF NOT EXISTS `Ticket` (
                                        `id` INTEGER PRIMARY KEY AUTO_INCREMENT,
                                        `film` VARCHAR(255) NOT NULL,
    `antall` INTEGER NOT NULL,
    `fornavn` VARCHAR(255) NOT NULL,
    `etternavn` VARCHAR(255) NOT NULL,
    `telefon` VARCHAR(255) NOT NULL,
    `epost` VARCHAR(255) NOT NULL
    );