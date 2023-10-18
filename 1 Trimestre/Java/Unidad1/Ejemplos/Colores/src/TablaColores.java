package Unidad1.Ejemplos.Colores.src;

/**
 * Tabla de colores con sus respectivos códigos ANSI.
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class TablaColores {

    public static void Colores(){
        System.out.println("┌──────────┬───────────┬──────────┬────────────────┐");
        System.out.println("│  Código  │   Color   │  Código  │     Color      │");
        System.out.println("├──────────┼───────────┼──────────┼────────────────┤");
        System.out.print("│    30    │\033[30m negro   \033[39;49m  │");
        System.out.println("    90    │\033[90m negro claro   \033[39;49m │");
        System.out.print("│    31    │\033[31m rojo     \033[39;49m │");
        System.out.println("    91    │\033[91m rojo claro    \033[39;49m │");
        System.out.print("│    32    │\033[32m verde    \033[39;49m │");
        System.out.println("    92    │\033[92m verde claro   \033[39;49m │");
        System.out.print("│    33    │\033[33m amarillo \033[39;49m │");
        System.out.println("    93    │\033[93m amarillo claro \033[39;49m│");
        System.out.print("│    34    │\033[34m azul     \033[39;49m │");
        System.out.println("    94    │\033[94m azul claro    \033[39;49m │");
        System.out.print("│    35    │\033[35m morado   \033[39;49m │");
        System.out.println("    95    │\033[95m morado claro  \033[39;49m │");
        System.out.print("│    36    │\033[36m cian     \033[39;49m │");
        System.out.println("    96    │\033[96m cian claro    \033[39;49m │");
        System.out.print("│    37    │\033[37m blanco   \033[39;49m │");
        System.out.println("    97    │\033[97m blanco claro  \033[39;49m │");
        System.out.println("└──────────┴───────────┴──────────┴────────────────┘");

        System.out.println(ConsoleColors.PURPLE_BACKGROUND + "esto tiene el fondo morado" + ConsoleColors.RESET);
    }

}
