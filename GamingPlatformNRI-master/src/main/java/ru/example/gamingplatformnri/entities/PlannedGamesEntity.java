package ru.example.gamingplatformnri.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "planned_games")
@Getter
@Setter
public class PlannedGamesEntity {
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "game_uuid")
    private int gameUuid;

    @Column(name = "max_players")
    private int maxPlayers;

    @Column(name = "begin_at")
    private String beginAt;

    @Column(name = "end_at")
    private String endAt;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "rpg_system")
    private String rpgSystem;

    @Column(name = "gamemaster_tgid")
    private String gameMasterTGID;

    @Column(name = "image")
    private String image;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "channel_ink")
    private String channelLink;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "changed_at")
    private String changedAt;

    @Column(name = "changed_by")
    private String changedBy;

    @Column(name = "status")
    private String status;

    public PlannedGamesEntity(){}

    @Override
    public String toString() {
        return "PlannedGamesEntity{" +
                "gameUuid=" + gameUuid +
                ", beginAt='" + beginAt + '\'' +
                ", endAt='" + endAt + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rpgSystem='" + rpgSystem + '\'' +
                ", gameMasterTGID='" + gameMasterTGID + '\'' +
                ", maxPlayers=" + maxPlayers +
                ", image='" + image + '\'' +
                ", messageId='" + messageId + '\'' +
                ", channelLink='" + channelLink + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", changedAt='" + changedAt + '\'' +
                ", changedBy='" + changedBy + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
