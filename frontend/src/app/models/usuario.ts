export interface Usuario {
    id: string;
    nombreUsuario: string;
    apellidoUsuario?: string;
    tipoUsuario: string;
    contaseniaUsuario: string;
    emailUsuario: string;
    telefonoUsuario: number;
    generoUsuario?: string;
}

export interface CreateUsuarioDTO extends Omit<Usuario, 'id'> {}