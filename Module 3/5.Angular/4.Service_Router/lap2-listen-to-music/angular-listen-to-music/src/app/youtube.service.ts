import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class YoutubeService {
    playlist = [
        {id: 'wJnBTPUQS5A', song: 'The Spectre - Alan Walker '},
        {id: 'cHHLHGNpCSA', song: 'Waiting For Love - Avicii'},
        {id: 'hCF4A8DsRKM', song: 'Tam Thốn Thiên Đường REMIX ✗ Hồng Nhan Xưa ✗ Lạnh Lẽo'},
        {id: '0X5wurmmtg8', song: 'Em nguyện làm một người bình thường bên cạnh anh - Nhạc Hoa'},
        {id: 'X7ZTpf_1fbs', song: 'Đoán Không Ra - Nhạc Hoa'}
    ];
    
    constructor() { }

    find(id: string) {
        return this.playlist.find(item => item.id === id);
    }
}