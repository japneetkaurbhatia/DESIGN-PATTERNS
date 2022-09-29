package interfaceSegregation;

public interface Store {
    void Save();
    void Delete();
    void Update();
    void Fetch();

}

public interface Store {

    void AddKey();
    void RemoveKey();
}
